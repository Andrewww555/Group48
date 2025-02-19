package lesson7HomeWork;

import java.util.Objects;

public class Animal {
    private double height;
    private int weight;
    private String name;
    private final String color;
    private final int numberOfPaws;
    private String favoriteFood;

    public Animal(double height, int weight, String name, String color, int numberOfPaws, String favoriteFood) {
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.favoriteFood = favoriteFood;
    }

    public void sayHelloOrName() {
        System.out.println("Привет! Меня зовут " + name);
    }

    public void sayHeight() {
        System.out.println("Мой рост " + height + "см");
    }

    public void sayWeight() {
        System.out.println("Мой вес " + weight + "кг");
    }

    public void sayColor() {
        System.out.println("Мой цвет " + color);
    }

    public void sayNumberOfPaws() {
        System.out.println("У меня " + numberOfPaws + " лапы/копыта");
    }

    public void sayFavoriteFood() {
        System.out.println("Моя любимая еда " + favoriteFood);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    @Override
    public String toString() {
        return "Животное: " +
                "рост: " + height + "см " +
                "вес: " + weight + "кг " +
                "имя: " + name + " " +
                "цвет " + color + " " +
                "количество лап/копыт: " + numberOfPaws + " " +
                "любимая еда: " + favoriteFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(height, animal.height) == 0 && weight == animal.weight && numberOfPaws == animal.numberOfPaws && Objects.equals(name, animal.name) && Objects.equals(color, animal.color) && Objects.equals(favoriteFood, animal.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, name, color, numberOfPaws, favoriteFood);
    }
}


