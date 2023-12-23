package org.example.effective_java.third_edition.try_with_resources;

import java.io.IOException;

public class ResourceWithExceptions implements AutoCloseable {

    public ResourceWithExceptions() {
        System.out.println("ResourceWithExceptions is created");
    }

    public void doJob() throws IOException {
        throw new IOException("ResourceWithExceptions do job failed");
    }

    @Override
    public void close() throws IOException {
        throw new IOException("ResourceWithExceptions can not be closed");
    }
}
