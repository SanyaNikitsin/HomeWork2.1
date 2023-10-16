package HomeWork13collections.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = 0;

        while(true){
            System.out.println("\nmenu:\n 1)collection animal\n " +
                    "2) add animal collections\n 3)delete animals collections\n 4) exit");
            try {
                operation = sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("number");
                sc.next();
            }

            switch (operation){
                case 1-> Animals.review();
                case 2 -> {
                    System.out.println("enter animals: ");
                    String animal = sc.next();
                    Animals.add(animal);
                }
                case 3-> Animals.delete();
                case 4 -> {return;}
            }
        }

    }
}
