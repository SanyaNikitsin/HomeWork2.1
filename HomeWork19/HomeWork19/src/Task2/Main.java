package Task2;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        int array[] = {5,8,9,2,4,1,3,6,7,0};

        BubbleSort bubbleSort = new BubbleSort(array);
        Thread bubble = new Thread(bubbleSort);

        InsertionSort insertionSort = new InsertionSort(array);
        Thread insertion = new Thread(insertionSort);

        SelectionSort selectionSort = new SelectionSort(array);
        Thread selection = new Thread(selectionSort);

        bubble.start();
        insertion.start();
        selection.start();

        bubble.join();
        insertion.join();
        selection.join();

        System.out.println("Sort bubble" + bubbleSort);
        System.out.println("Sort selection" + selectionSort);
        System.out.println("Sort insertion" + insertionSort);
    }
}
