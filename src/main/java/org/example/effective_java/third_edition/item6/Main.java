package org.example.effective_java.third_edition.item6;

@SuppressWarnings("ALL")
public class Main {

    public static void main(String[] args) {
        strings();

        long sum1Start = System.currentTimeMillis();
        sum1();
        System.out.println("sum1 duration time: " + (System.currentTimeMillis() - sum1Start));

        long sum2Start = System.currentTimeMillis();
        sum2();
        System.out.println("sum2 duration time: " + (System.currentTimeMillis() - sum2Start));
    }

    private static void strings() {
        boolean references = new String("test") == new String("test");
        boolean literals = "test" == "test";

        System.out.println("references: " + references);
        System.out.println("literals: " + literals);
    }

    private static long sum1() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    private static long sum2() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }
}
