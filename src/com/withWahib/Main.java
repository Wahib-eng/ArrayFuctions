package com.withWahib;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" أدخل عدد أسطر وأعمدة المصفوفة :  ");
        int row = in.nextInt();
        int column = in.nextInt();
        int[][] maitres = new int[row][column];
        int mashift[][]=new int[row][column];

        for (int j = 0; j < row; j++) {
            for (int i = 0; i < column; i++) {
                maitres[i][j] = (int) (Math.random() * 50);
                mashift[j][i]=(int)(Math.random()*mashift.length);
            }
        }
        printArray(maitres);
        printArray(mashift);
        int sum=0;
        for (int j = 0; j < row; j++)
            for (int i = 0; i < column; i++) {
                {
                    //عملية التحويل بين المصفوفتان
                    int temp=maitres[j][i];
                    maitres[j][i]=mashift[j][i];
                    mashift[j][i]=temp;
                    sum+=mashift[j][i];
                }

            }
        printArray(maitres);
        printArray(mashift);
        System.out.println(" ");

        System.out.println(" حاصل جمع الارقام في المصفوفة : "+sum);

    }
    private static  void printArray(int [][]matrices ){
        for (int[] matrix : matrices) {
            for (int c = 0; c < matrices[0].length; c++) {
                System.out.print(matrix[c] + "   \t");
            }
            System.out.println();
        }
        System.out.println("\n");

    }
}
