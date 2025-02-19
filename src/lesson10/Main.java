package lesson10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проверка метода получения случайной карты");
        System.out.println();
        Deck deck = new Deck();
        System.out.println(deck.getRandomCard());
    }
}
