package java_seminar_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float n1 = in.nextFloat();
        System.out.print("Введите операцию: ");
        String oper = in.next();
        System.out.print("Введите второе число: ");
        float n2 = in.nextFloat();
        if (oper.equals("+"))
            System.out.printf("Сумма чисел %.1f ", n1 + n2);
        else if (oper.equals("-"))
            System.out.printf("Разность чисел %.1f ", n1 - n2);
        else if (oper.equals("*"))
            System.out.printf("Произведение чисел %.1f ", n1 * n2);
        else if (oper.equals("/") & n2 != 0)
            System.out.printf("Частное чисел %.2f ", n1 / n2);
        in.close();
    }
}
