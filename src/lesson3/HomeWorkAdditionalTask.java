package lesson3;

public class HomeWorkAdditionalTask {
    public static void main(String[] args) {
        System.out.println("Задача 2. Вывести предложение “Я Java разработчик наоборот (задом наперед) в одну строку");
        String sentence = "Я Java разработчик";
        for (int index = sentence.length() - 1; index >= 0; index--) {
            System.out.print(sentence.charAt(index));
        }
    }
}
