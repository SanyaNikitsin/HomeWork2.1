package HomeWork11;//Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
//значений их длины.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arrayStr = new String[3];
        int i;
        for(i=0;i<3;i++){
            System.out.println("введите строку " + (i+1) + ":" );
            arrayStr[i]= in.nextLine();
        }
        Comparator <String> comparator = new StringLengthSort();
        Arrays.sort(arrayStr, comparator);
        System.out.println(" отсортировано от короткого к длинному:");
        for (i=0; i<3; i++){
            System.out.println(arrayStr[i]);
        }
    }
    static class StringLengthSort implements Comparator<String>{
        @Override
        public int compare(String o1,String o2){
            if(o1.length() > o2.length()){
                return 1;
            }else{
                if(o1.length() < o2.length()){
                    return -1;
                }else {
                    return 0;
                }
            }
        }
    }
}