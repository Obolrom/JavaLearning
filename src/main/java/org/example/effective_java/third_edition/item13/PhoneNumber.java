package org.example.effective_java.third_edition.item13;

import java.util.Objects;

public class PhoneNumber implements Cloneable {
    private final int area;
    private final int district;
    private final int lineNumber;

    public PhoneNumber(int area, int district, int lineNumber) {
        this.area = area;
        this.district = district;
        this.lineNumber = lineNumber;
    }

    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "area=" + area +
                ", district=" + district +
                ", lineNumber=" + lineNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber that = (PhoneNumber) o;
        return area == that.area && district == that.district && lineNumber == that.lineNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, district, lineNumber);
    }
}
