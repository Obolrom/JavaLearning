package org.example.effective_java.third_edition.try_with_resources;

public class Resource implements AutoCloseable {

    public Resource() {
        System.out.println("Resource is created");
    }

    public void doJob() {
        System.out.println("Resource does job");
    }

    @Override
    public void close() {
        System.out.println("Resource is closed");
    }
}
