package HomeLesson5;//1.1 Создать двумерный массив, заполнить его случайными числами.

public class MainLesson5 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = (int) (Math.random() * (20)) + 1;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}