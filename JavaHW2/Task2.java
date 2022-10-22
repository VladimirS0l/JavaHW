// Реализовать алгоритм сортировки вставками

package JavaHW.JavaHW2;

import java.util.Arrays;

public class Task2 {
    public static void inseration(int [] data) {
        for (int i = 0; i < data.length; i++) {
            int j = i - 1;
            int key = data[i];
            for (; j >=0; j--) {
                if (key < data[j]) {
                    data[j + 1] = data[j];
                }
                else break;
            }
            data[j + 1] = key;
        }
    }

    public static void printArr(int [] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = new int [] {5, 21, 7, 63, 99, 31, 13};
        System.out.println("Оригинальный массив: ");
        printArr(arr);
        inseration(arr);
        System.out.println("Отсортированный массив: ");
        printArr(arr);
    }
}

