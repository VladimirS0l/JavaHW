// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

package JavaHW.JavaHW2;

import java.util.Scanner;

public class Task1 {
    public static void move(int n, int kernelStart, int kernelEnd) {
        if (n == 0){
            return;
        }
        int intermediatePole = 6 - kernelStart - kernelEnd;
        move(n-1, kernelStart, intermediatePole);
        System.out.println("Передвигаем кольцо №" +n + " - с " + kernelStart + " стержня на " +kernelEnd + " стержень");
        move(n-1, intermediatePole, kernelEnd);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество колец в башне: ");
        int ringCount = scn.nextInt();
        scn.close();
        
        move(ringCount, 1, 3);
    }
}
