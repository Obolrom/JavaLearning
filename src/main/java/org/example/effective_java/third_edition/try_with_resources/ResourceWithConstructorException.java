package org.example.effective_java.third_edition.try_with_resources;

import java.io.IOException;

public class ResourceWithConstructorException implements AutoCloseable {

    public ResourceWithConstructorException() throws IOException {
        throw new IOException("ResourceWithConstructorException can not be created, I/O sample error");
    }

    public void doJob() {
        System.out.println("ResourceWithConstructorException does job");
    }

    @Override
    public void close() throws IOException {
        System.out.println("ResourceWithConstructorException is closed");
    }
}
