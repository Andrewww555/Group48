package lesson10;

import java.util.Scanner;

public class Blackjack {
    private Player[] players;

    public void start(int playersQuantity) {
        if (playersQuantity > 5) {
            System.out.println("Нельзя создать игру на " + playersQuantity + ". Укажите количество игроков менее 6 человек.");
            return;
        }

        players = new Player[playersQuantity];

        for (int playerIndex = 0; playerIndex < playersQuantity; playerIndex++) {
            System.out.println("Введите желаемое имя игрока " + (playerIndex + 1) + ":");
            Scanner scanner = new Scanner(System.in);
            String playerName = scanner.next();
        }
    }

    public void addPlayer(String playerName) {
        Player player = new Player(playerName);
        for (int index = 0; index < players.length; index++) {
            if (players[index] == null) {
                players[index] = player;
                return;
            }
        }
    }
}

