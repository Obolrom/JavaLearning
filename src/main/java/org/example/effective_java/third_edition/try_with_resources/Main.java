package org.example.effective_java.third_edition.try_with_resources;

import java.io.IOException;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) throws IOException {
//        sample1();
//        sample2();
        sample3();
//        sample4();
    }

    // normal try with resources, with no exceptions
    private static void sample1() {
        try (Resource resource = new Resource()) {
            resource.doJob();
        }
    }

    // try with resources, with exception when resource is being created
    private static void sample2() {
        try (ResourceWithConstructorException resource = new ResourceWithConstructorException()) {
            resource.doJob();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // try with resource, with doJob error & close (in auto-closeable) fail
    // close method exception is suppressed, but the most valuable exception (doJob fail) is shown first
    private static void sample3() throws IOException {
        try (ResourceWithExceptions resource = new ResourceWithExceptions()) {
            resource.doJob();
        }
    }

    // doJob throws exception, but if there is no catch block
    // the resource close only shows stack trace (if not suppressed of course)
    private static void sample4() throws IOException {
        ResourceWithExceptions resource = new ResourceWithExceptions();
        try {
            resource.doJob();
        } finally {
            resource.close();
        }
    }
}
