package HomeWork11;//1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
                   //найденные строки и их длину.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arraySt = new String[3];
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Введите 3 строки, строка " + (i + 1) + ":");
            arraySt[i] = sc.nextLine();
        }
        int max = 0;
        int min = arraySt[0].length();
        int indexMin = 0;
        int indexMax = 0;
        for (i = 0; i < 3; i++) {
            if (arraySt[i].length() > max) {
                indexMax = i;
                max = arraySt[i].length();
            }
            if (arraySt[i].length() < min) {
                indexMin = i;
                min = arraySt[i].length();
            }
        }
        System.out.println(" самая короткая строка " + arraySt[indexMin] + " " + min + " символа");
        System.out.println(" самая длинная строка " + arraySt[indexMax] + " " + max + " символа");
    }
}