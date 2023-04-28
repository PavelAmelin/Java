package java_seminar_4;

import java.util.Arrays;
import java.util.LinkedList;
public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<Integer>(Arrays.asList(3, 12, 21, 6, 74, 235, 32));
        System.out.println(Reversing(arr));
    }
    private static LinkedList<Integer> Reversing(LinkedList<Integer> lst) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (Integer i: lst) {
            result.addFirst(i);
        }
        return result;
    }
}
