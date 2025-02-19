package lesson3;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Вывести на консоль все числа от 10 до 50, кроме чисел с 34 до 45");

        for (int number = 10; number < 50; number++) {
            if (number >= 34 && number <= 45) {
                continue;
            }
            System.out.println(number);
        }

        System.out.println("\nВывести все номера кабинетов ВУЗа, при условии," +
                " что там 6 этажей и на каждом по 9 кабинетов");
        System.out.println("Перестать считать с 45 кабинета, далее идёт спортзал");

        for (int floor = 1; floor <= 6; floor++) {
            for (int cabinetOfFloor = 1; cabinetOfFloor <= 9; cabinetOfFloor++) {
                if (floor == 4 && cabinetOfFloor == 5) {
                    break;
                }
                System.out.println("Кабинет № " + floor + cabinetOfFloor);
            }
        }
    }
}
