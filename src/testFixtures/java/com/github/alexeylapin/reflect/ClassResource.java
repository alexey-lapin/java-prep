package com.github.alexeylapin.reflect;

import org.joor.TunedCompile;
import org.joor.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ClassResource {

    private static String basePackage = "";

    public static void setBasePackage(String name) {
        basePackage = Objects.requireNonNull(name);
    }

    private final List<String> parts = new ArrayList<>();

    private ClassResource(String name) {
        parts.add(basePackage);
        parts.add(Objects.requireNonNull(name));
    }

    public static ClassResource fromPackage(String name) {
        return new ClassResource(Objects.requireNonNull(name));
    }

    public ClassResource ofPackage(String name) {
        parts.add(Objects.requireNonNull(name));
        return this;
    }

    public ClassResource ofClass(String name) {
        parts.add(Objects.requireNonNull(name));
        return this;
    }

    public Reflect compile() {
        Reflect compiled = Reflect.onClass(TunedCompile.compile(getName(), getContent(), new CompileOptions()));
        if (compiled == null) {
            throw new ReflectException("failed to compile");
        }
        return compiled;
    }

    public String getName() {
        return parts.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.trim().isEmpty())
                .collect(Collectors.joining("."));
    }

    public String getContent() {
        String path = getName().replace(".", "/") + ".java";
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(path)) {
            if (is == null) {
                throw new ReflectException("failed to found source");
            }
            try (InputStreamReader isr = new InputStreamReader(is);
                 BufferedReader reader = new BufferedReader(isr)) {
                return reader.lines().collect(Collectors.joining(System.lineSeparator()));
            }
        } catch (IOException ex) {
            throw new RuntimeException("failed to read source", ex);
        }
    }

}
