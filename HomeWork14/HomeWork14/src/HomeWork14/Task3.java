package HomeWork14;/*Задача 3:
        Используя Function реализовать лямбду, которая будет принимать в себя строку в
        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        возвращать сумму, переведенную сразу в доллары.
*/

import java.util.Scanner;
import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        double rate = 3.3;
        Scanner sc = new Scanner(System.in);
        System.out.println("введите сумму в BYN");
        String money = sc.next();
        String[] moneyByn;
        moneyByn = money.split(" ");
        Function<Integer, Double> convert = x -> x / rate;

        System.out.println("Сумма в BYN: " + convert.apply(Integer.valueOf(moneyByn[0])));
    }
}

