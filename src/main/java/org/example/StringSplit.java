package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static List<String> split(String input, String delimiter) {
        if(input == null || input.isEmpty()) return new ArrayList<>();
        if(delimiter == null || delimiter.isEmpty()) return List.of(input);

        List<String> values = new ArrayList<>();
        StringBuilder currentValue = new StringBuilder();
        char[] inputChars = input.toCharArray();
        char[] delimiterChars = delimiter.toCharArray();
        int skip = delimiter.length();

        for (int i = 0; i < input.length(); i++){
            boolean delimit = true;
            for (int j = 0, f = i; j < delimiter.length(); j++, f++) {
                if (inputChars[f] != delimiterChars[j]) {
                    delimit = false;
                    break;
                }
            }
            if (delimit){
                i += skip - 1;
                values.add(currentValue.toString());
                currentValue = new StringBuilder();
            } else {
                currentValue.append(inputChars[i]);
            }
        }
        values.add(currentValue.toString());
        return values;
    }
}
