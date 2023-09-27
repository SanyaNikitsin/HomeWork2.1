package HomeWork11;//Вывести на консоль новую строку, которой задублирована каждая буква из
//начальной строки. Например, "Hello" -> "HHeelllloo"

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = in.nextLine();

        char[] letters=str.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i;
        for (i=0; i<str.length(); i++) {
            sb.append(letters[i]).append(letters[i]);
        }
        String s2=sb.toString();
        System.out.println("строка с задублированными буквами: " + s2);
    }
}