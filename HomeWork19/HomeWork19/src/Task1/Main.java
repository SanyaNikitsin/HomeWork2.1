package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];

        System.out.println("Enter element massiv");
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1) + "element" );
            try{
                array[i] = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Enter number");
            }
        }

        MaxElement maxElement = new MaxElement(array);
        Thread max = new Thread(maxElement);

        MinElement minElement = new MinElement(array);
        Thread min = new Thread(minElement);

        max.start();
        min.start();

        max.join();
        min.join();

        System.out.println("Max element massiv" + maxElement.getMax());
        System.out.println("Min element massiv" + minElement.getMin());
    }
}