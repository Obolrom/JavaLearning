package org.example.effective_java.third_edition.item14;

public class PhoneNumber implements Comparable<PhoneNumber> {
    final int areaCode;
    final int prefix;
    final int lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    @Override
    public int compareTo(PhoneNumber phoneNumber) {
        int result = Integer.compare(areaCode, phoneNumber.areaCode);
        if (result == 0) {
            result = Integer.compare(prefix, phoneNumber.prefix);
            if (result == 0)
                result = Integer.compare(lineNum, phoneNumber.lineNum);
        }
        return result;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", prefix=" + prefix +
                ", lineNum=" + lineNum +
                '}';
    }
}
