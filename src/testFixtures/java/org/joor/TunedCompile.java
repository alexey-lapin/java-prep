package org.joor;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.StringWriter;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TunedCompile {

    public static Class<?> compile(String className, String content, CompileOptions compileOptions) {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        ClassLoader cl = lookup.lookupClass().getClassLoader();

        try {
            return cl.loadClass(className);
        } catch (ClassNotFoundException ignore) {
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

            try {
                Compile.ClassFileManager fileManager = new Compile.ClassFileManager(compiler.getStandardFileManager(null, null, null));

                List<Compile.CharSequenceJavaFileObject> files = new ArrayList<>();
                files.add(new Compile.CharSequenceJavaFileObject(className, content));
                StringWriter out = new StringWriter();

                List<String> options = new ArrayList<>(compileOptions.options);
                if (!options.contains("-classpath")) {
                    StringBuilder classpath = new StringBuilder();
                    String separator = System.getProperty("path.separator");
                    String prop = System.getProperty("java.class.path");

                    if (prop != null && !"".equals(prop))
                        classpath.append(prop);

                    if (cl instanceof URLClassLoader) {
                        for (URL url : ((URLClassLoader) cl).getURLs()) {
                            if (classpath.length() > 0)
                                classpath.append(separator);

                            if ("file".equals(url.getProtocol()))
                                classpath.append(new File(url.toURI()));
                        }
                    }

                    options.addAll(Arrays.asList("-classpath", classpath.toString()));
                }

                JavaCompiler.CompilationTask task = compiler.getTask(out, fileManager, null, options, null, files);

                if (!compileOptions.processors.isEmpty())
                    task.setProcessors(compileOptions.processors);

                task.call();


                Class<?> result = null;

                // This works if we have private-access to the interfaces in the class hierarchy
                if (Reflect.CACHED_LOOKUP_CONSTRUCTOR != null) {
                    result = fileManager.loadAndReturnMainClass(className,
                            (name, bytes) -> Reflect.on(cl).call("defineClass", name, bytes, 0, bytes.length).get());
                }

                if (result == null) {
                    throw new ReflectException("Compilation error: " + out);
                }

                return result;
            } catch (ReflectException e) {
                throw e;
            } catch (Exception e) {
                throw new ReflectException("Error while compiling " + className, e);
            }
        }
    }

}
