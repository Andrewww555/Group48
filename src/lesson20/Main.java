package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("Пятёрочка", 600_000, 250));
        shops.add(new Shop("Магнит", 400_000, 180.5));
        shops.add(new Shop("Перекрёсток", 750_000, 390.2));
        shops.add(new Shop("Ашан", 1_650_000, 630.5));
        shops.add(new Shop("Светофор", 250_000, 180.5));
        shops.add(new Shop("Элит", 300_000, 280));

        System.out.println("Считаем общий доход по всем магазинам и выводим результат:");
        System.out.println(StoreManagement.calculateTotalIncome(shops) + " рублей");

        System.out.println("\nСчитаем количество магазинов и выводим результат:");
        System.out.println(StoreManagement.countShops(shops) + " магазинов");

        System.out.println("\nСчитаем средний доход на каждый магазин и выводим результат");
        System.out.println(StoreManagement.calculateAverageIncome(shops) + " рубля");

        System.out.println("\nСортируем магазины по доходности от большего к меньшему и выводим результат:");
        StoreManagement.sortShopsByIncomeDescending(shops).forEach(System.out::println);

        System.out.println("\nСортируем магазины по соотношению дохода на 1 квадратный метр и выводим результат:");
        StoreManagement.sortAndPrintShopsByIncomePerSquareMeterDescending(shops);

        System.out.println("\nВыводим по 2 лучших и худших магазинов по доходу:");
        System.out.println(StoreManagement.printTopAndBottomShopsByIncome(shops));

        System.out.println("\nВыводим в консоль магазины, доход которых больше 1000 рублей на 1 квадоатный метр:");
        StoreManagement.filterAndPrintShopsByIncomePerSquareMeter(shops, 1000);
    }
}
