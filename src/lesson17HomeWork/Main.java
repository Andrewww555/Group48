package lesson17HomeWork;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, 2.5, "Gold");
        Coin coin2 = new Coin(5, 1999, 2.5, "Gold");
        Coin coin3 = new Coin(10, 1990, 2.5, "Gold");
        Coin coin4 = new Coin(50, 1899, 5, "Olovo");
        Coin coin5 = new Coin(5, 1869, 10, "Silver");
        Coin coin6 = new Coin(5, 1869, 10, "Zmetall");

//       System.out.println("Сортировка монет в виде отдельного класса SortByDiameterComparator:");
//       System.out.println();
//       Set<Coin> coins = new TreeSet<>(new SortByDiameterComparator());
        System.out.println("Сортировка монет в виде анонимного класса, приоритет по металлу:");
        System.out.println();
        Set<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (!o1.getMetalName().equals(o2.getMetalName())) {
                    return o2.getMetalName().compareTo(o1.getMetalName());
                }
                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal();
                }
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
            }
        });
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        for (Coin coin : coins) {
            System.out.println(coin);
        }
    }
}
