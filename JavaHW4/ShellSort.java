package JavaHW4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShellSort {
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
    static void shellSort(int[] arr) {
        int gap = arr.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < arr.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (arr[c] > arr[c+gap]) {
                        swap(arr, c, c+gap);
                    }
                }
            }
            gap = gap / 2;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scn.nextInt();
        scn.close();
        int[] arr = new int [n];
        getArr(arr);
        System.out.println("Orig array: ");
        printArr(arr);
        System.out.println("Sort array: ");
        shellSort(arr);
        printArr(arr);
    }
}
