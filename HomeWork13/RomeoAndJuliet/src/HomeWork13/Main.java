package HomeWork13;/*В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
                   Проанализировать и записать в другой файл самое длинное слово*/

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String text;
        int max = 0;
        String search = null;
        try (FileReader fileReader = new FileReader("src\\HomeWork13\\Romeo and Juliet")) {
            StringBuilder stringBuilder = new StringBuilder();
            int i;
            /*String line;*/
            while ((i = fileReader.read()) != -1)
                stringBuilder.append((char) i);
            text = stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String[] words = text.split("\\s|=|\n");
        for (String t : words)
            if (t.length() > max) {
                max = t.length();
                search = t;
            }
        /*System.out.println(search);*/
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src\\HomeWork13\\File output"))){
            writer.write(search);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

