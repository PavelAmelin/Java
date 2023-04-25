package java_seminar_3;

import java.util.ArrayList;
import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(44, 14, 3, 56, 77, 5, 334));
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }
}
