package Task1;

import java.util.Arrays;

public class MinElement implements  Runnable {
    private int[] array;
    private int min;

    public MinElement(int[] array){
        this.array = array;
    }
    public int getMin(){
        return min;
    }
    @Override
    public void run() {
        min = Arrays.stream(array).min().orElse(Integer.MIN_VALUE);
    }
}
