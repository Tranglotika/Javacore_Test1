package com.company;

public class MultiArray2 {
    public static void createArray() {
        String arr[][] = new String[4][4];
        for (int i=0; i< arr.length; i++){
            for(int j=0; j<= i; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
