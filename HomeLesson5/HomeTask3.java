package HomeLesson5;//Найти сумму всех получившихся элементов и вывести в консоль.

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// обьявляем сканнер
        System.out.print("Введите количество строк");
        int x = input.nextInt();
        System.out.print("Введите количество столбцов");
        int c = input.nextInt();
        int[][] array = new int[x][c];
        int total = 0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {//строки
            for (int j = 0; j < array[i].length; j++) {//столбцы
                System.out.println("Введите число в массив ");
                int a = input.nextInt();
                array[i][j] = a;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
            System.out.println("Сумма элементов массива" + total);
        }
    }
}
