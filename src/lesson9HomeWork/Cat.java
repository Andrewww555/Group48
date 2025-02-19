package lesson9HomeWork;

public class Cat extends Animal {

    public Cat(int age, int weight) {
        super(age, weight);
    }

    public void lookAtTheOwnerWithContempt() {
        System.out.println("Смотрю на хозяина с презрением");
    }

    @Override
    public void move() {
        System.out.println("Грациозно иду кошачьей походкой");
    }

    @Override
    public void eat() {
        System.out.println("Кушаю рыбу");
    }
}
