package JavaHW4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuttleSort {
    static void getArr(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1,20);
        }
    }
    static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
    static void shuttleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                swap(arr, i, i-1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (arr[z] < arr[z - 1]) {
                        swap(arr, z, z-1);
                    } else {break;}
                    
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scn.nextInt();
        scn.close();
        int [] arr = new int[n];
        getArr(arr);
        System.out.println("Orig array: ");
        printArr(arr);
        System.out.println("Sort array");
        shuttleSort(arr);
        printArr(arr);
    }
}
