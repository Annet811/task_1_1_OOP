package org.example;

public class StringJoin {
    public static String join(String[] strings, String delimiter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            stringBuilder.append(strings[i]);
            if (i != strings.length - 1) {
                stringBuilder.append(delimiter);
            }
        }
        return stringBuilder.toString();
    }
}
