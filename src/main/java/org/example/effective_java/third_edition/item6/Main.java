package org.example.effective_java.third_edition.item6;

public class Main {
    public static void main(String[] args) {
        boolean references = new String("test") == new String("test");
        boolean literals = "test" == "test";

        System.out.println("references: " + references);
        System.out.println("literals: " + literals);
    }
}
