package com.github.alexeylapin.launcher;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Launcher {

    public static String testHome = System.getProperty("test.home");

    public static Result launch(Class<?> clazz, String... args) {
        String[] arguments = Stream.concat(Stream.of("java", clazz.getName()), Arrays.stream(args))
                .toArray(String[]::new);
        ProcessBuilder builder = new ProcessBuilder(arguments);
        builder.redirectErrorStream(true);
        builder.directory(Paths.get(testHome).toFile());
        try {
            Process process = builder.start();
            process.waitFor();
            List<String> outputLines = new BufferedReader(new InputStreamReader(process.getInputStream()))
                    .lines()
                    .collect(Collectors.toList());
            return new Result(process.exitValue(), outputLines);
        } catch (Exception ex) {
            throw new RuntimeException("failed to launch", ex);
        }
    }

}
