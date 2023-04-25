package java_seminar_3;

import java.util.ArrayList;
import java.util.Arrays;
public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 12, 1, 6, 74, 25, 32));
        int min_val = 1000000, max_val = 0;
        int total = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) < min_val)
                min_val = arr.get(i);
            else if (arr.get(i) > max_val)
                max_val = arr.get(i);
            total += arr.get(i);
        }
        System.out.printf("минимальное %d максимальное %d среднее %d", min_val, max_val, total / arr.size());
    }
}
