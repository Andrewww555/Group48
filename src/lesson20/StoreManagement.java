package lesson20;

import java.util.List;
import java.util.stream.Collectors;

public class StoreManagement {

    public static int calculateTotalIncome(List<Shop> shops) {
        return shops.stream()
                .mapToInt(Shop::getIncome)
                .sum();
    }

    public static long countShops(List<Shop> shops) {
        return shops.stream()
                .count();
    }

    public static double calculateAverageIncome(List<Shop> shops) {
        return shops.stream()
                .collect(Collectors.averagingInt(Shop::getIncome));
    }

    public static List<Shop> sortShopsByIncomeDescending(List<Shop> shops) {
        return shops.stream()
                .sorted((shop1, shop2) -> Integer.compare(shop2.getIncome(), shop1.getIncome()))
                .collect(Collectors.toList());
    }

    public static void sortAndPrintShopsByIncomePerSquareMeterDescending(List<Shop> shops) {
        shops.stream()
                .sorted((shop1, shop2) -> Double.compare(
                        shop2.getIncome() / (shop2.getArea() == 0 ? 1 : shop2.getArea()),
                        shop1.getIncome() / (shop1.getArea() == 0 ? 1 : shop1.getArea())
                ))
                .forEach(shop -> {
                    double incomePerSquareMeter = shop.getIncome() / (shop.getArea() == 0 ? 1 : shop.getArea());
                    System.out.println("Shop{name='" + shop.getName() + "', income=" + shop.getIncome() +
                            ", area=" + shop.getArea() + ", incomePerSquareMeter=" + incomePerSquareMeter + "}");
                });
    }

    public static String printTopAndBottomShopsByIncome(List<Shop> shops) {
        StringBuilder result = new StringBuilder();

        List<Shop> sortedShops = shops.stream()
                .sorted((shop1, shop2) -> Integer.compare(shop2.getIncome(), shop1.getIncome()))
                .collect(Collectors.toList());

        List<Shop> top2BestShops = sortedShops.stream()
                .limit(2)
                .collect(Collectors.toList());

        List<Shop> top2WorstShops = sortedShops.stream()
                .skip(sortedShops.size() - 2)
                .collect(Collectors.toList());

        result.append("Топ-2 лучших магазинов по доходу:\n");
        top2BestShops.forEach(shop -> result.append(shop).append("\n"));

        result.append("\nТоп-2 худших магазинов по доходу:\n");
        top2WorstShops.forEach(shop -> result.append(shop).append("\n"));

        return result.toString();
    }

    public static void filterAndPrintShopsByIncomePerSquareMeter(List<Shop> shops, double threshold) {
        shops.stream()
                .filter(shop -> shop.getIncome() / (shop.getArea() == 0 ? 1 : shop.getArea()) > threshold)
                .forEach(shop -> {
                    double incomePerSquareMeter = shop.getIncome() / (shop.getArea() == 0 ? 1 : shop.getArea());
                    System.out.println("Shop{name='" + shop.getName() + "', income=" + shop.getIncome() +
                            ", area=" + shop.getArea() + ", incomePerSquareMeter=" + incomePerSquareMeter + "}");
                });
    }
}

