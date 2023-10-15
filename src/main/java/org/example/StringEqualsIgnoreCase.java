package org.example;

public class StringEqualsIgnoreCase {
    public static boolean equalsIgnoreCase(String string1, String string2) {
        if (string1 == null || string2 == null) {
            return string1 == string2;
        }

        int length = string1.length();
        if (length != string2.length()) {
            return false;
        }

        for (int i = 0; i < string1.length(); i++) {
            char c1 = Character.toLowerCase(string1.charAt(i));
            char c2 = Character.toLowerCase(string2.charAt(i));
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}
