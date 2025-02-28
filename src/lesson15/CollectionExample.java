package lesson15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(25);
        arrayList.add(10);
        arrayList.add(100);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(35);
        linkedList.add(505);
        linkedList.add(25);
        linkedList.add(5);
        linkedList.add(100);

        System.out.println("Объединение двух коллекций с дубликатами");
        System.out.println(utils.union(arrayList, linkedList));
        System.out.println("\nПересечение двух коллекций с дубликатами");
        System.out.println(utils.intersection(arrayList, linkedList));
        System.out.println("\nОбъединение двух коллекций без дубликатов");
        System.out.println(utils.unionWithoutDuplicate(arrayList, linkedList));
        System.out.println("\nПересечение двух коллекций без дубликатов");
        System.out.println(utils.intersectionWithoutDuplicate(arrayList, linkedList));
        System.out.println("\nРазность двух коллекций ");
        System.out.println(utils.difference(arrayList, linkedList));
    }
}
