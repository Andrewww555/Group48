package lesson11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Классная работа:");
        Integer number = 5;
        int primitiveNumber = number;
        String string = String.valueOf(primitiveNumber);
        System.out.println(string);

        double num = 2.5;
        Double referenceType = num;
        Integer referenceNumber = 52;
        if (referenceType > referenceNumber) {
            System.out.println(referenceType);
        } else {
            System.out.println(referenceNumber);
        }

        String unit = "5.5";
        Double unitDou = Double.parseDouble(unit);
        int primitive = unitDou.intValue();
        System.out.println(primitive);

        System.out.println("\nДалее начинаем выполнение домашней работы:");
        System.out.println("\nЗадание №1: Определение типов данных");
        int x = 10;
        System.out.println(x + " - это примитивный тип данных");

        String str = "Hello";
        System.out.println(str + " - это ссылочный тип данных");

        boolean isTrue = true;
        System.out.println(isTrue + " - это примитивный тип данных");

        double d = 3.14;
        System.out.println(d + " - это примитивный тип данных");

        // Integer i = new Integer(20);
        // Эту строчку пришлось изменить, так как создание нового объекта new Integer выдавал ошибку.
        // Тем не менее создание нового объекта это ссылочный тип
        Integer i =  Integer.valueOf(20);
        System.out.println(i + " - это ссылочный тип данных");

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " - это ссылочный тип данных");

        char c = 'a';
        System.out.println(c + " - это примитивный тип данных");

        float f = 2.718f;
        System.out.println(f + " - это примитивный тип данных");

        System.out.println("\nЗадание 2: Преобразования типов");
        int numeric = 75;
        String stringNumeric = String.valueOf(numeric);
        int reciprocalNumeric = Integer.parseInt(stringNumeric);
        System.out.println("Выводим на экран преобразованную переменную из строки в число: " + reciprocalNumeric);
        double fraction = 0.5;
        int numberWithoutFraction = (int) fraction;
        System.out.println("Выводим на экран преобразованную переменную без дробной части: " + numberWithoutFraction);
        int[] array = {1, 2, 3, 4, 5};
        ArrayList<Integer> listNumber = new ArrayList<>();
        for (int numOfArray : array) {
            listNumber.add(numOfArray);
        }
        System.out.println("Выводим на экран числа из массива упакованные из int в Integer: " + listNumber);

        System.out.println("\nЗадание 3: Работа с классами-обёртками");
        Integer integer = 45;
        Integer integer5 = Integer.valueOf(46);
        boolean comparisons = integer.equals(integer5);
        if (comparisons == true) {
            System.out.println("Сравниваемые переменные равны - " + comparisons);
        } else {
            System.out.println("Сравниваемые переменные не равны - " + comparisons);
        }
        String stringIndex = "525";
        int numberMethod = Integer.parseInt(stringIndex);
        System.out.println("Вывожу число на экран. которое преобразовали через parseInt: " + numberMethod);
    }
}
