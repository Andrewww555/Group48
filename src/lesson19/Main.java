package lesson19;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> trees = List.of("Береза", "Дуб", "", "Ель", "Клен", "", "Тополь", "Рябина", "Ива", "Сосна");
        System.out.println("Выводим в консоль слова, в которых есть буква Т и О, но нет буквы А:");
        TreeValidationPredicate predicate = new TreeValidationPredicate();
        for (String tree : trees) {
            if (predicate.test(tree)) {
                System.out.println(tree);
            }
        }

        System.out.println("\nВыводим в консоль слова, в которых есть буква Т и О, но нет буквы А, в виде анонимного класса");
        Predicate<String> anonymousPredicate = new TreeValidationPredicate() {
            @Override
            public boolean test(String tree) {
                if (tree == null && tree.length() == 0) {
                    return false;
                }
                String upperCaseTree = tree.toUpperCase();

                if (!upperCaseTree.contains("Т")) {
                    return false;
                }

                if (!upperCaseTree.contains("О")) {
                    return false;
                }

                return !upperCaseTree.contains("А");
            }
        };
        for (String tree : trees) {
            if (anonymousPredicate.test(tree)) {
                System.out.println(tree);
            }
        }

        System.out.println("\nВыводим в консоль все не пустые слова через Consumer:");
        ConsumerExample consumer = new ConsumerExample();
        for (String tree : trees) {
            consumer.accept(tree);
        }

        System.out.println("\nВыводим в консоль все не пустые слова через Consumer, в виде анонимного класса:");
        Consumer<String> anonymousConsumer = new ConsumerExample() {
            @Override
            public void accept(String tree) {
                if (tree != null && !tree.isEmpty()) {
                    System.out.println(tree);
                }
            }
        };
        for (String tree : trees) {
            anonymousConsumer.accept(tree);
        }

        System.out.println("\nСгенерируем 5 случайных четных чисел от 25 до 50 с помощью Supplier:");
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for (int index = 0; index < 5; index++) {
            System.out.println(randomNumberGenerator.get());
        }

        System.out.println("\nСгенерируем 5 случайных четных чисел от 25 до 50 с помощью Supplier, в виде анонимного класса:");
        Supplier<Integer> randomNumberGeneratorSup = new RandomNumberGenerator() {
            @Override
            public Integer get() {
                int number = 1;
                while (number % 2 != 0) {
                    number = ThreadLocalRandom.current().nextInt(25, 50);
                }
                return number;
            }
        };
        for (int i = 0; i < 5; i++) {
            System.out.println(randomNumberGenerator.get());
        }
    }
}

