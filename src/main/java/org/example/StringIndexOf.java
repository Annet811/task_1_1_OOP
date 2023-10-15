package org.example;

public class StringIndexOf {
    public static int indexOf(String string, String target) {
        char[] stringChars = string.toCharArray();
        char[] targetChars = target.toCharArray();
        for (int i = 0; i < stringChars.length; i++){
            boolean find = true;
            for (int j = 0, b = i; j < targetChars.length; j++, b++){
                if (targetChars[j] != stringChars[b]){
                    find = false;
                    break;
                }
            }
            if (find) {
                return i;
            }
        }
        return -1;
    }
}
