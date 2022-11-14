package JavaHW4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CountingSort {
    static void getArr(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1,20);
        }
    }
    static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    static int maxValue(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }
    static int [] countingSort(int[] arr, int maxValue) {
        int numCounts[] = new int[maxValue+1];
        for (int num : arr) {
            numCounts[num]++;
        }
        int[] sortedArray = new int[arr.length];
        int currentSortIndex = 0;
        for (int n = 0; n < numCounts.length; n++) {
            int count = numCounts[n];
            for (int k = 0; k < count; k++) {
                sortedArray[currentSortIndex] = n;
                currentSortIndex++;
            }
        }
        return sortedArray;
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
        printArr(countingSort(arr, maxValue(arr)));
    }
}
