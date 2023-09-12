package HomeWork4;//заполнение массива рандомными числами

import java.util.Scanner;
public class MainTask2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива (целое число) максимальный диапозон 15");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();// размер массива который ввёл пользов с клавиатуры
        int array[] = new int[size];// создаём массив int размером size
        for(int i = 0; i < array.length; i++){
            array [i] = (int) (Math.random() *(15 + 1)) + 1;//генерирует случайные числа от 1 до 15
            System.out.print(" " + array [i]);//выводит заполн массив ранд числами
        }
        //System.out.println("Заполненый массив");
        //for (i = 0; i < size; i++){
          //  System.out.println(" " + array[i]);
        }

        //int a =(int) (Math.random() * (10 + 1)) - 1;// генерирует случайное число от -1 до 10
        //System.out.println(a);//выводит случайное число от -1 до 10
    }

