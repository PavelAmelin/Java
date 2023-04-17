package java_seminar_1;

public class task_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    cnt += 1;
            }
            if (cnt == 2)
                System.out.print(i + " ");
        }
    }
}
