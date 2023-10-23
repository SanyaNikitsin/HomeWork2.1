package HomeWork15;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,8,2,6,2,5,83,5);
        int sum = numbers.stream()
                .distinct()
                .filter(x->x%2==0)
                .reduce((x1,x2)->x1+x2).orElse(0);
        System.out.println("Сумма оставшихся элементов списка " + numbers +" равна " + sum);
    }
}