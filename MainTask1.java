import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        int num;
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if ( num % 2 == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
    }
}
