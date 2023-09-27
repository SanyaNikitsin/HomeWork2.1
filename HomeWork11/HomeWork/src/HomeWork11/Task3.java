package HomeWork11;//Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
//средней, а также их длину.
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] arrayStr = new String[3];
        int i;
        double sum=0;

        for (i=0; i<3; i++) {
            System.out.println("введите строку " + (i+1) +":");
            arrayStr[i]=in.nextLine();
            sum+=arrayStr[i].length();
        }
        double average=sum/ arrayStr.length;

        System.out.println("средняя длина: " + average);
        for (i=0; i<3; i++) {
            if (arrayStr[i].length()<average) {
                System.out.println(arrayStr[i] + ", меньше средней: " + arrayStr[i].length());
            }
        }
    }
}
