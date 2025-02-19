package lesson5;

import java.util.Scanner;

/**
 * Калькулятор периметров фигур
 */
public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру для расчета периметра");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - трапеция");
        System.out.println("4 - эллипс");
        System.out.println("5 - круг");

        //У сканера есть режимы работы
        //System.in - читает из консоли
        //System.out - пишет в консоль

        //У сканера есть несколько способов чтения из консоли
        //nextInt() - читает int числа из консоли
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Введите сторону а: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            int perimeter = MathUtils.countPerimeterOfTriangle(a, b, c);
            System.out.println("Периметр треугольника равен: " + perimeter);

        } else if (userChoice == 2) {
            System.out.println("Введите сторону a: ");
            int a = scanner.nextInt();

            int perimeter = MathUtils.countPerimeterOfSquare(a);
            System.out.println("Периметр квадрата равен: " + perimeter);

        } else if (userChoice == 3) {
            System.out.println("Введите сторону a: ");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b: ");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c: ");
            int c = scanner.nextInt();

            System.out.println("Введите сторону d: ");
            int d = scanner.nextInt();

            int perimeter = MathUtils.countPerimeterOfTrapezoid(a, b, c, d);
            System.out.println("Периметр трапеции равен: " + perimeter);

        } else if (userChoice == 4) {
            System.out.println("Введите длину полуоси a: ");
            int a = scanner.nextInt();

            System.out.println("Введите длину полуоси b: ");
            int b = scanner.nextInt();

            double perimeter = MathUtils.countPerimeterOfEllipse(a, b);
            System.out.println("Периметр эллипса равен: " + perimeter);

        } else {
            System.out.println("Введите радиус круга r: ");
            int r = scanner.nextInt();

            double perimeter = MathUtils.countPerimeterOfСircle(r);
            System.out.println("Периметр круга равен: " + perimeter);
        }
    }
    //Домашнее задание:
    //Дописать решение для остальных фигур
    //В классе MathUtils - ТОЛЬКО МАТЕМАТИКА В МЕТОДАХ,
    // запрос данных от пользователя и вывод результата в консоль в FigurePerimeterCalculator
}
