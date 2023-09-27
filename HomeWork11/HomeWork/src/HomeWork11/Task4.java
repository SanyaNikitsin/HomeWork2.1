package HomeWork11;//Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
//Если таких слов несколько, найти первое из них.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] arrayStr = new String[3];
        int i;

        for (i=0; i<3; i++) {
            System.out.println("введите строку " + (i+1) +":");
            arrayStr[i]=in.nextLine();
        }

        for (i=0; i<3; i++) {
            char[] word = arrayStr[i].toCharArray();
            boolean noDuplicates=true;
            for (int j=0; j<word.length; j++) {
                for (int k=j+1; k<word.length; k++) {
                    if (word[j]==word[k]) {
                        noDuplicates=false;
                        break;
                    }
                }
            }
            if (noDuplicates == true) {
                System.out.println("слово без повторяющихся символов: " + arrayStr[i]);
                break;
            }
        }
    }
}
