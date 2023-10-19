package HomeWork14;/*Задача 1:
        Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        когда пользователю исполнится 100 лет. Использовать Date/Time API.*/

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data of birth format (hyphenated) example (year-month-days)");
        while (true){
            String line = sc.nextLine();
            try{
                LocalDate localDate = LocalDate.parse(line);
                System.out.println("in 100 years from your birth there will be " + localDate.plusYears(100) + " year,month,days");
                return;
            }catch (DateTimeParseException e){
                System.out.println("enter your date of birth in the format year-month-day");
            }
        }
    }
}