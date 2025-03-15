package lesson19;

import java.util.function.Predicate;

public class TreeValidationPredicate implements Predicate<String> {
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
}
