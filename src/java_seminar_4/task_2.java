package java_seminar_4;

import java.util.LinkedList;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<Integer>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        System.out.println(arr);
        enqueue(arr, 11);
        enqueue(arr, 13);
        dequeue(arr);
        first(arr);
    }
    private static void enqueue(LinkedList<Integer> lst, int val) {
        lst.addLast(val);
        System.out.println(lst);
    }
    private static void dequeue(LinkedList<Integer> lst) {
        int el1 = lst.getFirst();
        lst.removeFirst();
        System.out.println(el1);
        System.out.println(lst);
    }
    private static void first(LinkedList<Integer> lst) {
        int el = lst.getFirst();
        System.out.println(el);
        System.out.println(lst);
    }
}
