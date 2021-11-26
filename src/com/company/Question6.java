package com.company;

import java.util.Scanner;

public class Question6 {
    public static void createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int column = sc.nextInt();
        sc.nextLine();
        String arr[][] = new String[row][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử mảng thứ [" + i + j + "] ");
                arr[i][j] = sc.nextLine();
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Các phần tử nằm trên đường chéo chính là: ");
        if (row == column) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i == j) {
                        System.out.print(arr[i][j] + "\t");
                    }
                }
            }
        } else System.out.println("Mảng không có đường chéo chính");
    }
}
