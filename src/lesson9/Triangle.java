package lesson9;

import java.util.Objects;

class Triangle extends Shape {
    private double heightLength;
    private double sideLength;

    @Override
    double calculateArea() {
        return heightLength * sideLength / 2;
    }

    public Triangle(double sideA, double sideB) {
        this.heightLength = sideA;
        this.sideLength = sideB;
    }

    public double getHeightLength() {
        return heightLength;
    }

    public void setHeightLength(double heightLength) {
        this.heightLength = heightLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return "Треугольник: " +
                "длина высоты - " + heightLength + " " +
                "длина стороны - " + sideLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(heightLength, triangle.heightLength) == 0 && Double.compare(sideLength, triangle.sideLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(heightLength, sideLength);
    }
}
