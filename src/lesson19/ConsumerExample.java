package lesson19;

import java.util.function.Consumer;

public class ConsumerExample implements Consumer<String> {
    @Override
    public void accept(String tree) {
        if (tree != null && !tree.isEmpty()) {
            System.out.println(tree);
        }
    }
}
