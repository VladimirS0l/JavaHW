package JavaHW3;

import java.util.ArrayList;
import java.util.Stack;

public class Task1 {
    private final Position start;// Начальная точка лабиринта
    private final Position end;// Конец лабиринта
    private ArrayList<String> footPrint;
    private ArrayList<Position> test;
    private Stack<Position> stacks;// Cтек
    private Position currentPosition;// Определяем текущую позицию
    public Task1() {// Устанавливаем, инициализация стека работает
        start = new Position(1, 5);
        end = new Position(8, 7);
        currentPosition = start;
        stacks = new Stack<>();
        test = new ArrayList<>();
    }
    public static final int map[][] = // Определяем сетку карты 10 * 10
            {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
            {1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
            {1, 0, 1, 0, 0, 0, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
    public static void printMap() {// Распечатать карту
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (map[i][j] == 1) System.out.print(" ■");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public boolean moveTop() {// Двигаться вверх
        String s = currentPosition.getPx() + "" + (currentPosition.getPy() - 1);
        if ((map[currentPosition.getPx()][currentPosition.getPy() - 1] != 1) & !isArrived(s)) {
            footPrint.add(s);
            return true;
        }
        return false;
    }
    public boolean moveRight() {// Сдвиг вправо
        String s = (currentPosition.getPx() + 1) + "" + currentPosition.getPy();
        if (map[currentPosition.getPx() + 1][currentPosition.getPy()] != 1 & !isArrived(s)) {
            footPrint.add(s);
            return true;
        }
        return false;
    }
    public boolean moveBottom() {// Двигаться вниз
        String s = currentPosition.getPx() + "" + (currentPosition.getPy() + 1);
        if ((map[currentPosition.getPx()][currentPosition.getPy() + 1] != 1) & !isArrived(s)) {
            footPrint.add(s);
            return true;
        }
        return false;
    }
    public boolean moveLeft() {// Сдвиг влево
        String s = (currentPosition.getPx() - 1) + "" + currentPosition.getPy();
        if ((map[currentPosition.getPx() - 1][currentPosition.getPy()] != 1) & !isArrived(s)) {
            footPrint.add(s);
            return true;
        }
        return false;
    }
    public boolean isArrived(String position) {// Определяем, была ли достигнута текущая позиция
        return footPrint.contains(position);
    }
    public void move() {// Функция перемещения перемещается в четырех направлениях соответственно, а затем помещает возможный путь в стек
        if (moveRight()) {
            Position temp = new Position(currentPosition.getPx(), currentPosition.getPy() - 1);
            test.add(temp);
            stacks.push(temp);
        } else if (moveBottom()) {
            Position temp = new Position(currentPosition.getPx() + 1, currentPosition.getPy());
            test.add(temp);
            stacks.push(temp);
        } else if (moveTop()) {
            Position temp = new Position(currentPosition.getPx(), currentPosition.getPy() + 1);
            test.add(temp);
            stacks.push(temp);
        } else if (moveLeft()) {
            Position temp = new Position(currentPosition.getPx() - 1, currentPosition.getPy());
            test.add(temp);
            stacks.push(temp);
        } else {
            currentPosition = stacks.pop();// Если текущая позиция не может перемещаться во всех четырех направлениях
        }
    }
    public static void main(String[] args) {
        Task1 m = new Task1();
        m.footPrint = new ArrayList<>();
        m.footPrint.add("15");
        m.stacks.push(m.start);
        while (m.currentPosition.getPx() != 8 || m.currentPosition.getPy() != 8) {
            m.move();
        }
        printMap();
        System.out.println("Следующее - след, длина:" + m.footPrint.size());
        m.printFootPrint();
    }
    public void printFootPrint() {
        for (int i = 0; i < footPrint.size(); i++) {
            System.out.print(footPrint.get(i) + ",");
        }
        System.out.println();
    }
}
class Position {
    private int px;
    private int py;
    public Position(int px, int py) {
        this.px = px;
        this.py = py;
    }
    public int getPx() {
        return px;
    }
    public void setPx(int px) {
        this.px = px;
    }
    public int getPy() {
        return py;
    }
    public void setPy(int py) {
        this.py = py;
    } 
} 