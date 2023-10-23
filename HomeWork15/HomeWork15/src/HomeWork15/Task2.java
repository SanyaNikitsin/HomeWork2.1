package HomeWork15;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> id = Map.of(4, "Anna",
                9, "Nikita",
                23, "Ivan",
                11, "Pavel",
                81, "Liza",
                7, "Nazar",
                0, "Masha",
                1, "Tanya",
                2, "Katya",
                8, "Aleksey");

        List<String> newId = id.entrySet().stream()
                .filter(x -> List.of(1, 2, 5, 8, 9, 13).contains(x.getKey()))
                .filter(x -> x.getValue().length() % 2 != 0)
                .map(x -> new StringBuilder(x.getValue()).reverse().toString())
                .collect(Collectors.toList());
        System.out.println(newId);
    }
}
