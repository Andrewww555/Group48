package lesson9HomeWork;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(2, 4);
        Dog dog = new Dog(5, 20);
        Bird bird = new Bird(1, 2);

        System.out.println("Демонстрация метода Cat:");
        cat.lookAtTheOwnerWithContempt();

        System.out.println("\nДемонстрация методов Dog:");
        dog.runAfterTheBall();
        dog.beGoodBoy();

        System.out.println("\nДемонстрация метода Bird:");
        bird.fly();

        System.out.println("\nСоздали разных животных и сложили их в массив животное");
        Animal[] animals = {cat, dog, bird};
        for (Animal animal : animals) {
            System.out.println();

            if (animal instanceof Cat) {
                System.out.println(cat);
                System.out.println("Это кошка и вот её методы:");
                Cat catFromArray = (Cat) animal;
                catFromArray.lookAtTheOwnerWithContempt();
            } else if (animal instanceof Dog) {
                System.out.println(dog);
                System.out.println("Это собака и вот её методы:");
                Dog dogFromArray = (Dog) animal;
                dogFromArray.runAfterTheBall();
                dogFromArray.beGoodBoy();
            } else if (animal instanceof Bird) {
                System.out.println(bird);
                System.out.println("Это птица и вот её методы:");
                Bird birdFromArray = (Bird) animal;
                birdFromArray.fly();
            }
            animal.move();
            animal.eat();
        }
    }
}
