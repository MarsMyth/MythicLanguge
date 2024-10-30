package org.mythical_studios.strings;

public class NewStrings {
    private String value;

    private NewStrings(String value) {
        this.value = value;
    }

    public static Object newString(String str) {
        return new NewStrings(str);
    }

    @Override
    public String toString() {
        return value;
    }

    public NewStrings append(String toAppend) {
        this.value += toAppend;
        return this;
    }
}