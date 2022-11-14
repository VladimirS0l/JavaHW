// БОЛЬШАЯ ЗАДАЧА НА ВЕКА
// Попробовать описать логику взаимодействия человека и котика
// Человек зовёт котика - котик бежит к своему хозяину
// ps если котиков много - бежит только один

package JavaHW5;

import java.util.Arrays;
import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        Man man = new Man();
        man.firstName = "Vladimir";
        man.lastName = "Solarev";
        man.name_animal = "Marqiz";

        Cat cat1 = new Cat();
        cat1.name = "Mars";
        cat1.color = "Black-white";
        cat1.type = "Non-type";

        Cat cat2 = new Cat();
        cat2.name = "Marqiz";
        cat2.color = "Peach";
        cat2.type = "British";

        Cat cat3 = new Cat();
        cat3.name = "Sonya";
        cat3.color = "Grey";
        cat3.type = "British";

        var cats = new HashSet<Cat>(Arrays.asList(cat1, cat2, cat3));
        for (Cat cat : cats) {
            if (man.name_animal.equals(cat.name)) {
                System.out.printf("Кот %s подбежит к %s", cat.name, man.firstName);
            }
        }
    }


}


