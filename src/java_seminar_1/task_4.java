package java_seminar_1;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String q = in.nextLine();
        String w = in.nextLine();
        int e = in.nextInt();
        int cnt = 0;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String q1 =  q.replace("?", Integer.toString(i));
                String w1 =  w.replace("?", Integer.toString(j));
                if (Integer.parseInt(q1) + Integer.parseInt(w1) == e & i == j) {
                    System.out.printf("%s %s", i, j);
                    cnt += 1;
                }
            }
        }
        if (cnt == 0)
            System.out.print("Нет решений");
        in.close();
    }
}
