package HomeWork4;//Задача 3: Найти индексы минимального и максимального элементов и вывести в консоль.

import java.util.Scanner;

public class MainTask5 {
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
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (max > array[i]) {
                max = array[i];
                maxIndex = i;
            } else if (min < array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("MaxIndex: " + maxIndex);
        System.out.println("MinIndex: " + minIndex);
    }
}