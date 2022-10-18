//2. Реализовать алгоритм пирамидальной сортировки (HeapSort)

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
        
    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i) {
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите размер массива N: ");
        int input = scn.nextInt();
        scn.close();

        Random rnd = new Random();
        int[] arr = new int[input];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1, 99);
        }

        System.out.println("Рандомный массив: ");
        printArray(arr);
        
        Task2 ob = new Task2();
        ob.sort(arr);
        System.out.println("Отсортированный массив: ");
        printArray(arr);
    
    }
}
