package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.io.*;

public class Question5 {
    public static void Standardized() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
        name.trim();
        name = name.replaceAll("//s+"," ");

        String[] arr = name.split(" ");
        String standardized = "";
        for (int i = 0;i< arr.length;i++) {
            standardized += String.valueOf(arr[i].charAt(0)).toUpperCase()+arr[i].substring(1).toLowerCase()+" ";
        }
        System.out.println("Chuỗi sau khi chuẩn hóa là: "+standardized);

        System.out.println("Nhập chuỗi bất kì: ");
        String inputString = sc.nextLine();
        char kyTu;

        for (int i = 0; i < inputString.length(); i++) {
            kyTu = inputString.charAt(inputString.length() - i - 1);
            if (inputString.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }
        }
    }
}
