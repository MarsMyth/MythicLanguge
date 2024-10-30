package org.mythical_studios.strings;

// MyInt.java
public class NewInts {
    private double value;

    private NewInts(double value) {
        this.value = value;
    }

    // Static factory method to handle both int and double inputs
    public static NewInts newInt(double value) {
        return new NewInts(value);
    }

    // Getter to retrieve the value as double
    public double getValue() {
        return value;
    }

    // Arithmetic methods with chaining support
    public NewInts add(double toAdd) {
        this.value += toAdd;
        return this;
    }

    public NewInts subtract(double toSubtract) {
        this.value -= toSubtract;
        return this;
    }

    public NewInts multiply(double factor) {
        this.value *= factor;
        return this;
    }

    public NewInts divide(double divisor) {
        if (divisor != 0) {
            this.value /= divisor;
        }
        return this;
    }

    // Override toString to show integer format if no decimals, else show double
    @Override
    public String toString() {
        if (value == (long) value) {
            return String.format("%d", (long) value); // Display as integer
        } else {
            return String.format("%s", value); // Display as decimal
        }
    }
}