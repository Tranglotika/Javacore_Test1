package com.company;

import java.util.Scanner;

public class Question4 {
    public static void FirstTenPrimeNumber(int n) {
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }
    public static void LowerThanTenPrimeNumber(int n) {
        System.out.printf("\nCác số nguyên tố nhỏ hơn %d là: \n", n);
        int j = 2;
        while (j < n) {
            if (isPrimeNumber(j)) {
                System.out.print(j + " ");
            }
            j++;
        }
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
