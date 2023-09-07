package HomeWork4;/*Задача 4:Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
сообщение, что их нет.*/

import java.util.Scanner;

public class MainTask6 {
    public static void main(String[] args) {//заполнение массива рандомными числами
        System.out.println("Введите размер массива (целое число) максимальный диапозон 15");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();// размер массива который ввёл пользов с клавиатуры
        int array[] = new int[size];// создаём массив int размером size
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (15 + 1)) + 1;//генерирует случайные числа от 1 до 15
            System.out.println(" " + array[i]);//выводит заполн массив ранд числами
        }
        int zeroElements = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                ++zeroElements;
            }
        }
        if(zeroElements > 0)
            System.out.println("количество нулевых элементов " + zeroElements + " ");
        else{
            System.out.println("в массиве нет нулевых элементов");
        }
    }
}