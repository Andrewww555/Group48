package lesson9;

public class Main {
    public static void main(String[] args) {
        System.out.println("Узнать площадь круга");
        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.calculateArea());

        System.out.println("\nУзнать площадь прямоугольника");
        Rectangle rectangle = new Rectangle(15, 5);
        System.out.println(rectangle);
        System.out.println(rectangle.calculateArea());

        System.out.println("\nУзнать площадь треугольника");
        Triangle triangle = new Triangle(4.4, 6.6);
        System.out.println(triangle);
        System.out.println(triangle.calculateArea());
    }
}
