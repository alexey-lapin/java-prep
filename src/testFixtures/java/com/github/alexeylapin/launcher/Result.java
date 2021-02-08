package com.github.alexeylapin.launcher;

import java.util.List;

public class Result {

    public Result(int exitCode, List<String> outputLines) {
        this.outputLines = outputLines;
        this.exitCode = exitCode;
    }

    private int exitCode;
    private List<String> outputLines;

    public String getOutput() {
        return String.join("\n", outputLines);
    }

    public List<String> getOutputLines() {
        return outputLines;
    }

    public int getExitCode() {
        return exitCode;
    }

    public boolean isSuccessful() {
        return exitCode == 0;
    }

}
