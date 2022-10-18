// 1. Написать программу вычисления n-ого треугольного числа

import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = scn.nextInt();
        scn.close();        
        System.out.println("n-ый треугольник: ");
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(" " + k);
            }
        System.out.println("");    
        }
    }
}


