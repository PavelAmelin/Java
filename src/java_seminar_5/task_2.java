package java_seminar_5;

import java.util.*;
import java.util.stream.Collectors;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<String> list_name = new ArrayList<>(Arrays.asList("Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"));
        HashMap<String, Integer> dict_name = new HashMap<>();
        int cnt = 0;
        int i;
        String name;
        for (String full_name: list_name) {
            i = full_name.indexOf(" ");
            name = full_name.substring(0, i);
            if (dict_name.containsKey(name)) {
                cnt = dict_name.get(name) + 1;
                dict_name.put(name, cnt);
            }
            else {
                cnt = 1;
                dict_name.put(name, cnt);
            }
        }
        Map<String, Integer> sortedMap = dict_name.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
        for (var el: sortedMap.entrySet())
            System.out.println(el);
    }
}
