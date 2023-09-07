package HomeWork4;//Задача 1: Пройти по массиву, вывести все элементы в прямом и в обратном порядке.

import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива (целое число) максимальный диапозон 15");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();// размер массива который ввёл пользов с клавиатуры
        int array[] = new int[size];// создаём массив int размером size
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (14 + 1)) + 1;//генерирует случайные числа от 1 до 15
            System.out.print(" " + array[i]);//выводит заполн массив ранд числами
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++){
            System.out.print(" " + array[i]);
        }
        System.out.println(" ");
        for (int i = array.length - 1; i>= 0; i--){
            System.out.print(" " + array[i]);
        }
    }
}
