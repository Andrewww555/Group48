package lesson4;

public class HomeWork4 {
    public static void main(String[] args) {

        System.out.println("1) Создать массив 6 на 6 сразу с числами" +
                "        \n2) Перезаписать во все ячейки нули (0)" +
                "        \n3) Вывести диагональ сверху вниз" +
                "        \n4) Вывести в шахматном порядке");
        int[][] newTwoDimensionalArray = {
                {1, 2, 3, 4, 5, 6},
                {10, 20, 30, 40, 50, 60},
                {100, 200, 300, 400, 500, 600},
                {3000, 4000, 5000, 6000, 7000, 8000},
                {123, 456, 789, 987, 654, 321},
                {101, 202, 303, 404, 505, 606},
        };
        //Первым циклом идем по ячейкам основного массива
        for (int verticalIndex = 0; verticalIndex < newTwoDimensionalArray.length; verticalIndex++) {
            //Получаем содержимое каждой ячейки и записываем в переменную
            int[] nestedArray = newTwoDimensionalArray[verticalIndex];
            //Теперь идем по всем ячейкам вложенного массива
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                newTwoDimensionalArray[verticalIndex][horizontalIndex] = 0;
                int number = nestedArray[horizontalIndex];

                if (verticalIndex == horizontalIndex) {
                    System.out.println(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
            // Идея вывода в шахматном порядке через if если (verticalIndex + horizontalIndex) % 2 == 0
            // то вывести на экран номер ячейки
        }
        int[][] newDimensionalArray = {
                {1, 2, 3, 4, 5, 6},
                {10, 20, 30, 40, 50, 60},
                {100, 200, 300, 400, 500, 600},
                {3000, 4000, 5000, 6000, 7000, 8000},
                {123, 456, 789, 987, 654, 321},
                {101, 202, 303, 404, 505, 606},

        };
        //Первым циклом идем по ячейкам основного массива
        for (int verticalIndex = 0; verticalIndex < newDimensionalArray.length; verticalIndex++) {
            //Получаем содержимое каждой ячейки и записываем в переменную
            int[] nestedArray = newDimensionalArray[verticalIndex];
            //Теперь идем по всем ячейкам вложенного массива
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                newDimensionalArray[verticalIndex][horizontalIndex] = 0;
                int number = nestedArray[horizontalIndex];

                if ((verticalIndex + horizontalIndex) % 2 == 0) {
                    System.out.print(number + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}