package org.example;

public class StringReplace {

    public static String replace(String input, String oldStr, String newStr) {
        if (input == null || oldStr == null || newStr == null) {
            throw new IllegalArgumentException("Входные параметры не могут быть null");
        }

        if (oldStr.isEmpty()) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        int startIndex = 0;
        int oldStrIndex;

        while ((oldStrIndex = input.indexOf(oldStr, startIndex)) != -1) {
            result.append(input, startIndex, oldStrIndex);
            result.append(newStr);
            startIndex = oldStrIndex + oldStr.length();
        }

        result.append(input, startIndex, input.length());

        return result.toString();
    }
}
