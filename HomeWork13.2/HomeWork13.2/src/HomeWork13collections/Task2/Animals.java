package HomeWork13collections.Task2;

import java.util.Arrays;
import java.util.LinkedList;

public class Animals {
    private static LinkedList<String>  animals = new LinkedList<>(Arrays.asList(
            "tiger", "bear", "barsuk", "monkey", "cat"));
    public static void add(String name){
        animals.addFirst(name);
    }

    public static void delete(){
        animals.removeLast();
        System.out.println("delete complete)");
    }

    public static void review(){
        System.out.println("Animals: ");
        int size = animals.size();
        for(int i = 0; i<size; i++)
            System.out.println((i+1)+") " + animals.get(i));
    }
}
