package HomeWork4;//Задача 6:Проверить, является ли массив возрастающей
                  // последовательностью (каждое следующе число больше предыдущего).

import java.util.Scanner;

public class MainTask8 {
    public static void main(String[] args) {//заполнение массива рандомными числами
        System.out.println("Введите размер массива (целое число) максимальный диапозон 15");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();// размер массива который ввёл пользов с клавиатуры
        int array[] = new int[size];// создаём массив int размером size
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (15 + 1)) + 1;//генерирует случайные числа от 1 до 15
            System.out.print(" " + array[i]);//выводит заполн массив ранд числами
        }
        boolean someValue = true;
        for(int i =0; i < array.length - 1; i++){
            if(array[i] > array[i + 1]){
                someValue = false;
                break;
            }
        }
        System.out.println(" " + "Массив являеться возрастающим ?");
        System.out.println(someValue);
    }
}