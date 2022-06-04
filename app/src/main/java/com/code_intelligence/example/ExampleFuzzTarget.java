package com.code_intelligence.example;

public class ExampleFuzzTarget {

    public static void fuzzerTestOneInput(byte[] input) {
        ExampleApplication.main();
    }
}
