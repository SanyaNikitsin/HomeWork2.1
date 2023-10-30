import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean t = true;

        System.out.println("Введите строку");
        String line = sc.nextLine();

        Pattern pattern = Pattern.compile("([A-Z]|[А-Я]){2,}");
        Matcher matcher = pattern.matcher(line);

        while(matcher.find())
            if(matcher.group().length() <7) {
                System.out.println(matcher.group());
                t = false;
            }

        if(t)
            System.out.println("В строке нет аббревиатур");
    }
}