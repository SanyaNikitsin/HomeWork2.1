package HomeWork4;

import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива(целое число)");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();// размер массива который ввёл пользов с клавиатуры
        int array[] = new int[size];// создаём массив int размером size
        System.out.println("заполните массив числами");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();//заполняем массив числами
        }
        System.out.println("заполненый массив");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);//выводит полученный массив/
        }
    }
}