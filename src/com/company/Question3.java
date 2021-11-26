package com.company;

import java.util.Random;

public class Question3 {
    public static void PrimeNumber() {
        Random n = new Random();
        int number = n.nextInt(100);
        System.out.println("Số ngẫu nhiên là: " + number);
        System.out.println("Số này có phải số nguyên tố không? "+isPrimeNumber(number));
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
