package java_seminar_1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int tot = 0;
        int f = 1;
        for (int i = 1; i <= n; i++) {
            tot += i;
            f *= i;
        }
        System.out.printf("Сумма чисел: %d \n", tot);
        System.out.printf("Произведение чисел: %d ", f);
        in.close();
    }
}
