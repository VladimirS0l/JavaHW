package JavaHW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    static void getArr(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 20);
        }
    }
    static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else { break; }
            }
            arr[i + 1] = value;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scn.nextInt();
        scn.close();
        int[] arr = new int[n];
        getArr(arr);
        System.out.println("Original array: ");
        printArr(arr);
        System.out.println("Sort array: ");
        insertionSort(arr);
        printArr(arr);

    }
}