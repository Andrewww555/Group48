package lesson9;

import java.util.Objects;

class Rectangle extends Shape {
    private int lengthA;
    private int widthB;

    @Override
    double calculateArea() {
        return lengthA * widthB;
    }

    public Rectangle(int lengthA, int widthB) {
        this.lengthA = lengthA;
        this.widthB = widthB;
    }

    public int getLengthA() {
        return lengthA;
    }

    public void setLengthA(int lengthA) {
        this.lengthA = lengthA;
    }

    public int getWidthB() {
        return widthB;
    }

    public void setWidthB(int widthB) {
        this.widthB = widthB;
    }

    @Override
    public String toString() {
        return "Прямоугольник: " +
                "длина А - " + lengthA + " " +
                "ширина B - " + widthB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return lengthA == rectangle.lengthA && widthB == rectangle.widthB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthA, widthB);
    }
}
