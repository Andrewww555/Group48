package lesson18;

public class FridgeExample {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Банан", 200);
        fridge.addProduct("Масло", 500);
        fridge.addProduct("Банан", 400);
        fridge.addProduct("Йогурт", 150);
        fridge.addProduct("Колбаса", 1000);

        System.out.println("\nВыведем все продукты и веса от Я до А");
        fridge.printAllProductsFromZToA();

        System.out.println("\nВзяли из холодильника");
        fridge.takeProduct();

        System.out.println("\nВыводим вес всех продуктов");
        fridge.showWeightAllProduct();

        System.out.println("\nВыводим вес конкретного продукта");
        fridge.printProductWeight("Масло");
        fridge.printProductWeight("Арбуз");

        System.out.println("\nВыводим наименование продукта, который закончится первым");
        String minProduct = fridge.findProductWithMinWeight();
        if (minProduct != null) {
            System.out.println("Продукт, который закончится первым: " + minProduct);
        } else {
            System.out.println("Холодильник пуст!");
        }

        System.out.println("\nВыводим наименование продукта, которого больше всего");
        String maxProduct = fridge.findProductWithMaxWeight();
        if (maxProduct != null) {
            System.out.println("Продукт с наибольшим весом: " + maxProduct);
        } else {
            System.out.println("Холодильник пуст");
        }

        System.out.println("\nВыводим наименование и вес продуктов, отсортированных по весу");
        fridge.printProductsSortedByWeightDescending();
    }
}
