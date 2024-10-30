package org.mythical_studios.strings.factory;

import org.mythical_studios.strings.NewStrings;

public class StringFactory {
    public static NewStrings newString(String str) {
        return (NewStrings) NewStrings.newString(str);
    }
}