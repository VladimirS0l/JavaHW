package JavaHW4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// O(n^2)
public class BubbleSort {
    static void getArr(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 20);
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
    static void bubbleSort(int[] arr) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i-1);
                    needIteration = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int[] arr = new int[n];
        getArr(arr);
        System.out.println("Original array: ");
        printArr(arr);  
        System.out.println("Sort array: ");
        bubbleSort(arr);
        printArr(arr);
    }
}
