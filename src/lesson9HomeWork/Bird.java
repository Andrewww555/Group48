package lesson9HomeWork;

public class Bird extends Animal {

    public Bird(int age, int weight) {
        super(age, weight);
    }

    public void fly() {
        System.out.println("Летаю в небе");
    }

    @Override
    public void move() {
        System.out.println("Взлетаю с места и лечу");
    }

    @Override
    public void eat() {
        System.out.println("Клюю зерно");
    }
}
