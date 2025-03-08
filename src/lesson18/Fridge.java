package lesson18;

import java.util.*;

public class Fridge {
    private Map<String, Integer> products = new HashMap<>();

    /**
     * Положить продукт в холодильник
     *
     * @param product название продукта
     * @param weight  вес продукта
     */
    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }

    public void printAllProductsFromZToA() {
        //По умолчанию отсортированы от А до Я, поэтому устанавливаем компаратор reverseOrder(),
        // который развернет порядок наоборот
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder());
        productNames.addAll(products.keySet());

        for (String productName : productNames) {
            System.out.println(productName + " - " + products.get(productName));
        }
    }

    public void takeProduct() {
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            String nameProduct = entry.getKey();
            Integer quantity = entry.getValue();
            System.out.println("Продукт - " + nameProduct + " его вес: " + quantity);
        }
    }

    public void showWeightAllProduct() {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Общий вес продуктов " + sum);
    }

    public void printProductWeight(String productName) {
        Integer weight = products.get(productName);
        if (weight != null) {
            System.out.println("Вес продукта " + productName + ": " + weight);
        } else {
            System.out.println("Продукт " + productName + " не найден в холодильнике");
        }
    }

    public String findProductWithMinWeight() {
        if (products.isEmpty()) {
            return null;
        }
        String minProduct = null;
        int minWeight = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            int currentWeight = entry.getValue();
            if (currentWeight < minWeight) {
                minWeight = currentWeight;
                minProduct = entry.getKey();
            }
        }
        return minProduct;
    }

    public String findProductWithMaxWeight() {
        if (products.isEmpty()) {
            return null;
        }
        String maxProduct = null;
        int maxWeight = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            int currentWeight = entry.getValue();
            if (currentWeight > maxWeight) {
                maxWeight = currentWeight;
                maxProduct = entry.getKey();
            }
        }
        return maxProduct;
    }

    public void printProductsSortedByWeightDescending() {
        if (products.isEmpty()) {
            System.out.println("Холодильник пуст!");
            return;
        }
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(products.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}