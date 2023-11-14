package Task2;

import java.util.Arrays;

public class SelectionSort implements Runnable{
    private int array[];

    public SelectionSort(int[] array){
        this.array = array;
    }

    @Override
    public  String toString(){
        return "SelectionSort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public void run(){
        for (int left = 0; left < array.length; left++){
            int minId = left;
            for(int i = left; i < array.length; i++){
                if(array[i] < array[minId]){
                    minId = i;
                }
            }
            int tmp = array[left];
            array[left] = array[minId];
            array[minId] = tmp;
        }
    }
}
