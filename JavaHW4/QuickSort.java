// Реализовать алгоритм быстрой сортировки
package JavaHW4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    static void getArr(int[] arr) {
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 20);
        }
    }
    static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int left_elem, int right_elem) {
        int left_arr = left_elem;
        int right_arr = right_elem;
        int pivot = arr[(left_arr+right_arr) / 2];
        do {
            while (arr[left_arr] < pivot) {
                left_arr++;
            }
            while (arr[right_arr] > pivot) {
                right_arr--;
            }
            if (left_arr <= right_arr) {
                if (left_arr <= right_arr) {
                    int temp = arr[left_arr];
                    arr[left_arr] = arr[right_arr];
                    arr[right_arr] = temp;
                }
                left_arr++;
                right_arr--;
            }
        }
        while (left_arr <= right_arr);
        if (left_arr < right_elem) {
            quickSort(arr, left_arr, right_elem);
        }
        if (left_elem < right_arr) {
            quickSort(arr, left_elem, right_arr);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int n = scn.nextInt();
        scn.close();
        int[] arr = new int[n];
        System.out.println("Оригинальный массив:");
        getArr(arr);
        printArr(arr);
        int left_elem = 0;
        int right_elem = n-1;
        System.out.println("Отсортированный массив:");
        quickSort(arr, left_elem, right_elem);
        printArr(arr);
    }
}