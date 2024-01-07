package org.example.effective_java.third_edition.item14;

import java.util.*;

import static java.util.Comparator.comparingInt;

public class Main {
    public static void main(String[] args) {
//        sortingAndDeduplicationBuiltinTypesWithTreeSetExample();
//        sortPhoneNumbersWithComparableExample();
        sortPhoneNumbersWithComparatorExample();
    }

    private static void sortPhoneNumbersWithComparableExample() {
        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(new PhoneNumber(705, 303, 2345));
        phoneNumbers.add(new PhoneNumber(705, 301, 2345));
        phoneNumbers.add(new PhoneNumber(705, 404, 2345));

        System.out.println("before sorting: " + phoneNumbers);
        Collections.sort(phoneNumbers);
        System.out.println("after  sorting: " + phoneNumbers);
    }

    private static void sortPhoneNumbersWithComparatorExample() {
        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(new PhoneNumber(705, 303, 2345));
        phoneNumbers.add(new PhoneNumber(705, 301, 2345));
        phoneNumbers.add(new PhoneNumber(705, 404, 2345));

        Comparator<PhoneNumber> comparator = comparingInt((PhoneNumber pn) -> pn.areaCode)
                .thenComparingInt(pn -> pn.prefix)
                .thenComparingInt(pn -> pn.lineNum);

        System.out.println("before sorting: " + phoneNumbers);
        phoneNumbers.sort(comparator);
        System.out.println("after  sorting: " + phoneNumbers);
    }

    private static void sortingAndDeduplicationBuiltinTypesWithTreeSetExample() {
        String[] alphabet = {"B", "C", "A", "B", "D", "F", "E"};
        Set<String> set = new TreeSet<>();
        Collections.addAll(set, alphabet);
        System.out.println(set);
    }
}
