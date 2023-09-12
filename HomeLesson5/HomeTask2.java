package HomeLesson5;//1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// обьявляем сканнер
        System.out.println("Введите количество строк");
        int x = input.nextInt();
        System.out.println("Введите количество столбцов");
        int c = input.nextInt();
        int[][] array = new int[x][c];
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
    }
}
