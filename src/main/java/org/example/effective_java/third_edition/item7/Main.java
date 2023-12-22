package org.example.effective_java.third_edition.item7;

public class Main {
    public static void main(String[] args) {
        sampleWithMemoryLeak();

        sampleWithFixedMemoryLeak();
    }

    private static void sampleWithMemoryLeak() {
        System.out.println("sampleWithMemoryLeak\n");
        StackWithMemoryLeak stack = new StackWithMemoryLeak();

        System.out.println(stack);

        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);
        System.out.println("---------------------------\n");
    }

    private static void sampleWithFixedMemoryLeak() {
        System.out.println("sampleWithFixedMemoryLeak\n");
        StackFixed stack = new StackFixed();

        System.out.println(stack);

        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
