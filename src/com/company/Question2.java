package com.company;

public class Question2 {
    public static void Char() {
        String statement = "You only live once, but if you do it right, once is enough";
        System.out.println(statement);
        int n = statement.length();
        System.out.println("Chuỗi có số từ là: " + n);

        char kitu = 'o';
        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == kitu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự o là " + count);

        System.out.println("Index của các ký tự o là: ");
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == kitu) {
                System.out.print(i+"\t");
            }
        }
    }
}