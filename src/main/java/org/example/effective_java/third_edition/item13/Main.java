package org.example.effective_java.third_edition.item13;

public class Main {
    public static void main(String[] args) {
//        phoneNumberCloneExample();
//        fixedStackCloneExample();
        fixedStackCloneExample2();
//        weakStackCloneExample();
    }

    private static void weakStackCloneExample() {
        WeakStack stack = new WeakStack();
        stack.push("first");
        stack.push("second");

        System.out.println(stack);

        WeakStack cloned = stack.clone();

        System.out.println(cloned);

        System.out.println("  ==   " + (stack == cloned));
        System.out.println("equals " + (stack.equals(cloned)));

        stack.pop();
        System.out.println("------------------------------------------------");
        System.out.println("original stack after pop: " + stack);
        System.out.println("cloned   stack after pop: " + cloned);
        System.out.println("  ==   " + (stack == cloned));
        System.out.println("equals " + (stack.equals(cloned))); // <- broken, because of inconsistent cloning
    }

    private static void fixedStackCloneExample() {
        FixedStack stack = new FixedStack();
        stack.push("first");
        stack.push("second");

        System.out.println(stack);

        FixedStack cloned = stack.clone();

        System.out.println(cloned);

        System.out.println("  ==   " + (stack == cloned));
        System.out.println("equals " + (stack.equals(cloned)));

        stack.pop();
        System.out.println("------------------------------------------------");
        System.out.println("original stack after pop: " + stack);
        System.out.println("cloned   stack after pop: " + cloned);
        System.out.println("  ==   " + (stack == cloned));
        System.out.println("equals " + (stack.equals(cloned)));
    }

    private static void fixedStackCloneExample2() {
        FixedStack stack = new FixedStack();
        stack.push("first");
        stack.push("second");

        System.out.println(stack);

        FixedStack cloned = stack.clone();

        System.out.println(cloned);

        System.out.println("  ==   " + (stack == cloned));
        System.out.println("equals " + (stack.equals(cloned)));

        stack.pop();
        cloned.pop();
        System.out.println("------------------------------------------------");
        System.out.println("original stack after pop: " + stack);
        System.out.println("cloned   stack after pop: " + cloned);
        System.out.println("  ==   " + (stack == cloned));
        System.out.println("equals " + (stack.equals(cloned)));
    }

    private static void phoneNumberCloneExample() {
        PhoneNumber phoneNumber = new PhoneNumber(707, 158, 5432);

        System.out.println(phoneNumber);

        PhoneNumber cloned = phoneNumber.clone();

        System.out.println(cloned);

        System.out.println("  ==   " + (phoneNumber == cloned));
        System.out.println("equals " + (phoneNumber.equals(cloned)));
    }
}
