package java_seminar_5;

import java.util.HashMap;
import java.util.Scanner;

public class task_1 {
    private static final HashMap<String, String> phone_book = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, String> phone_book = new HashMap<>();
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            if (n == 1)
                AddNumber();
            else if (n == 2)
                OutputAll();
            else if (n == 3)
                break;
        }
        in.close();
    }

    private static void AddNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String last_name = scanner.nextLine();
        System.out.println("Введите номер:");
        int num = scanner.nextInt();
        if (phone_book.containsKey(last_name)) {
            String new_num = phone_book.get(last_name) + ", "
                    + num;
            phone_book.put(last_name, new_num); }
        else
            phone_book.put(last_name, String.valueOf(num));
    }

    private static void OutputAll() {
        if (phone_book.isEmpty())
            System.out.println("Нет контактов");
        else {
            for (var el: phone_book.entrySet())
                System.out.println(el);
        }
    }
}

