package HomeWork4;//Задача 5 Пройти по массиву и поменять местами элементы первый и последний,
                  // второй и предпоследний и т.д.

import java.util.Scanner;

public class MainTask7 {
    public static void main(String[] args) {//заполнение массива рандомными числами
        System.out.println("Введите размер массива (целое число) максимальный диапозон 15");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();// размер массива который ввёл пользов с клавиатуры
        int array[] = new int[size];// создаём массив int размером size
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (15 + 1)) + 1;//генерирует случайные числа от 1 до 15
            System.out.print(" " + array[i]);//выводит заполн массив ранд числами
        }
        System.out.println();
        int x = 0;
        for(int i = 0; i < array.length / 2; i++){
            x = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = x;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}