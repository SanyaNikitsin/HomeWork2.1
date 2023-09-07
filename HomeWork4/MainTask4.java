package HomeWork4;//Задача 2:Найти минимальный-максимальный элементы и вывести в консоль.

import java.util.Scanner;

public class MainTask4 {
    public static void main(String[] args) {//заполнение массива рандомными числами
        System.out.println("Введите размер массива (целое число) максимальный диапозон 15");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();// размер массива который ввёл пользов с клавиатуры
        int array[] = new int[size];// создаём массив int размером size
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (15 + 1)) + 1;//генерирует случайные числа от 1 до 15
            System.out.println(" " + array[i]);//выводит заполн массив ранд числами
        }
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < array.length; i++) {
                if (max < array[i])
                    max = array[i];
            else if(min > array [i])
                min = array[i];
            }
            System.out.println(" " + "Max: " + max );
            System.out.println(" " + "Min: " + min);
    }
}
