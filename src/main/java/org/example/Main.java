package org.example;

public class Main {
    public static void main(String[] args) {

        String input = "раз,два,три,четыре,пять";
        String separator = ",";
        for (String part : StringSplit.split(input, separator)) {
            System.out.println(part);
        }
        System.out.println();

        String[] strings = {"abc", "def", "ghi"};
        String delimiter = "-";
        System.out.println(StringJoin.join(strings, delimiter));
        System.out.println();

        String string = "Hello, World!";
        String target = "World";
        System.out.printf("Индекс \"%s\" в строчке \"%s\": %d\n", target, string, StringIndexOf.indexOf(string, target));
        System.out.println();


        String string1 = "Hello";
        String string2 = "hello";
        System.out.println(StringEqualsIgnoreCase.equalsIgnoreCase(string1, string2));
        System.out.println();


        input = "Hello, world!";
        String oldStr = "world";
        String newStr = "Java";
        System.out.println(StringReplace.replace(input, oldStr, newStr));
        System.out.println();


        string = "Hello, World!";
        System.out.println(StringIsEmpty.isEmpty(string) ? "Строка пустая" : "Строка не пустая");
    }
}