import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        int num;
        System.out.println("Введите температуру: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if (num > -5)
        {
            System.out.println("тепло");
        }
        else if (-5 >= num && num > -5)//по улсовию -20 но тогда выполняется следующий блок если пользователь ввёл от -6 до -20
        {
            System.out.println("нормально");
        } if (num <= -20) ;
        {
            System.out.println("Холодно");
        }
    }
}
