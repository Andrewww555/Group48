package lesson9HomeWork;

public class Dog extends Animal {

    public Dog(int age, int weight) {
        super(age, weight);
    }

    public void runAfterTheBall() {
        System.out.println("Бегаю за мячиком");
    }

    public void beGoodBoy() {
        System.out.println("Быть хорошим мальчиком");
    }

    @Override
    public void move() {
        System.out.println("Несусь сломя голову");
    }

    @Override
    public void eat() {
        System.out.println("Грызу кость");
    }
}
