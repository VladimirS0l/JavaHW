package JavaHW4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    static void getArr(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1,20);
        }
    }
    static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr, int left, int right) {
        int delimetr = left + ((right-left)/2) + 1;
        if (delimetr > 0 && right > (left+1)) {
            mergeSort(arr, left, delimetr-1);
            mergeSort(arr, delimetr, right);
        }
        int[] buffer = new int[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimetr > right || arr[cursor] > arr[delimetr]) {
                buffer[i] = arr[cursor];
                cursor++;
            } else {
                buffer[i] = arr[delimetr];
                delimetr++;
            }
        }
        System.arraycopy(buffer, 0, arr, left, buffer.length);
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
        int left = 0;
        int right = n-1;
        mergeSort(arr, left, right);
        printArr(arr);
    }
}
