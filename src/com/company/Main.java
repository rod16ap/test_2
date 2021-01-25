package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1)  arr[i]=0;
            else arr[i]=1;
            System.out.print(arr[i] + " ");
        }
    }

    /*public static void main(String[] args) {
        int[] nums = new int [8];
        for (int i = 0; i < 8; i++) {
            nums[i] = i*3;
            System.out.print(nums[i] + " ");
        }
    }*/

    /*public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");
        }
    }*/


    /*public static void main(String args[]) {

        int[][] table = new int[4][4];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                if (i==j) table[i][j] = 1;
                else if (i+j==table.length-1) table[i][j] = 1;
                else table[i][j] = 0;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }*/

    /*public static void main(String[] args) {
        int[] arr = {18, 5, 3, 2, 11, 4, 1, 27, 4, 8, 9, 15};
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min=arr[i];
            else if (arr[i] > max) max=arr[i];

        }
        System.out.print("Минимальное число в массиве: " + min + "\n" + "Максимальное число в массиве: " + max);

    }*/

    /*public static boolean mainTest(int[] array){
        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1};
        int summ=0;
        for (int i = 0; i < arr.length; i++) {
            summ=summ+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
            if(arr[i]==summ - arr[i])
                return true;
            else return false;
        }
        return true;
    }*/


}
