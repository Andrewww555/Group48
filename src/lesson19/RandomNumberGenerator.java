package lesson19;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class RandomNumberGenerator implements Supplier<Integer> {
    @Override
    public Integer get() {
        int number = 1;
        while (number % 2 != 0) {
            number = ThreadLocalRandom.current().nextInt(25,50);
        }
        return number;
    }
}
