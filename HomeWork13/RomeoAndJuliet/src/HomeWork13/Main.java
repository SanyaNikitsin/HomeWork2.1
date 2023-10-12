package HomeWork13;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String inputFile = "C:\\Home Work\\HomeWork2.1\\HomeWork13\\romeo-and-juliet";
        String outputFile = "C:\\Home Work\\HomeWork2.1\\HomeWork13\\output.txt";
        try {
            Scanner scanner = new Scanner(inputFile);
            String longestWord = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            PrintWriter writer = new PrintWriter(outputFile);
            writer.println("Самое длинное слово: " + longestWord);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}