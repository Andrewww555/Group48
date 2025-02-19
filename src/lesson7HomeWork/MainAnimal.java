package lesson7HomeWork;

public class MainAnimal {
    public static void main(String[] args) {
        Animal cat = new Animal(20.6, 5, "cat", "рыжий", 4, "тунец");
        Animal dog = new Animal(60.2, 18, "dog", "белый", 4, "кость");
        Animal horse = new Animal(150.1, 500, "horse", "коричневый", 4, "сено");

        System.out.println("\nЗадаём имя, рост и вес для кота через сеттер");
        cat.setName("Борис");
        cat.setHeight(25.5);
        cat.setWeight(4);
        // Задаём говорящие методы для кота
        cat.sayHelloOrName();
        cat.sayHeight();
        cat.sayWeight();
        cat.sayColor();
        cat.sayNumberOfPaws();
        cat.sayFavoriteFood();

        // Создаём кота близнеца
        Animal catTwin = new Animal(25.5, 4,"Борис","рыжий",4,"тунец");

        System.out.println("\nЗадаём имя, рост и вес для собаки через сеттер");
        dog.setName("Лаки");
        dog.setHeight(65.5);
        dog.setWeight(20);
        // Задаём говорящие методы для собаки
        dog.sayHelloOrName();
        dog.sayHeight();
        dog.sayWeight();
        dog.sayColor();
        dog.sayNumberOfPaws();
        dog.sayFavoriteFood();

        System.out.println("\nЗадаём имя, рост и вес лошади через сеттер");
        horse.setName("Ураган");
        horse.setHeight(155.5);
        horse.setWeight(490);
        // Задаём говорящие методы для лошади
        horse.sayHelloOrName();
        horse.sayHeight();
        horse.sayWeight();
        horse.sayColor();
        horse.sayNumberOfPaws();
        horse.sayFavoriteFood();

        System.out.println("\nВывод данных о коте, через геттер:" + "\nИмя: " + cat.getName() + " вес: " + cat.getHeight()
                + " рост: " + cat.getWeight() + " цвет: " + cat.getColor() + " количество лап/копыт: "
                + cat.getNumberOfPaws() + " любимая еда: " + cat.getFavoriteFood());

        System.out.println("\nВывод данных о собаке, через геттер:" + "\nИмя: " + dog.getName() + " вес: " + dog.getHeight()
                + " рост: " + dog.getWeight() + " цвет: " + dog.getColor() + " количество лап/копыт: "
                + dog.getNumberOfPaws() + " любимая еда: " + dog.getFavoriteFood());

        System.out.println("\nВывод данных о лошади, через геттер:" + "\nИмя: " + horse.getName() + " вес: " + horse.getHeight()
                + " рост: " + horse.getWeight() + " цвет: " + horse.getColor() + " количество лап/копыт: "
                + horse.getNumberOfPaws() + " любимая еда: " + horse.getFavoriteFood());

        System.out.println("\nВывод через to String:");
        System.out.println(catTwin);

        System.out.println("\nСравниваем кота(cat) и кота близнеца(catTwin)");
        System.out.println(cat.equals(catTwin));

        System.out.println("\nСравниваем собаку(dog), лошадь(horse) и кота(саt)");
        System.out.println(dog.equals(horse) && cat.equals(dog) && horse.equals(cat));
    }
}

