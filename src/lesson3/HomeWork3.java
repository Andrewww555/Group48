package lesson3;

import java.lang.module.FindException;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа,"
                + " кроме 6, 10, 14. Как только цикл дойдет до 23,"
                + " остановить вывод и написать в консоль “достигнуто целевое число!”.");

        int[] array = new int[30];
        for (int index = 1; index < array.length; index++) {
            array[index] = index;
        }
        for (int index = 1; index < array.length; index++) {
            int number = array[index];

            if (number % 2 == 0) {

                if (number == 6 || number == 10 || number == 14) {
                    continue;
                }
                System.out.println(number);
            }

            if (number == 23) {
                System.out.println("достигнуто целевое число!");
                return;
            }
        }
    }
}