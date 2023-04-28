package java_seminar_4;

import java.util.LinkedList;
import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        LinkedList<Float> lst = new LinkedList<Float>();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float n1 = in.nextFloat();
        while (true) {
            System.out.print("Введите операцию: ");
            String oper = in.next();
            if (oper.equals("end")) {
                System.out.println("Завершение работы");
                break;
            }
            else if (oper.equals("c")) {
                lst.removeLast();
                System.out.println(lst.getLast());
            }
            else if (oper.equals("+") || oper.equals("-") || oper.equals("*") || oper.equals("/")) {
                System.out.print("Введите второе число: ");
                float n2 = in.nextFloat();
                if (oper.equals("+")) {
                    if (lst.size() < 1){
                        lst.add(n1 + n2);
                        System.out.printf("Сумма чисел %.1f \n", lst.getLast());}
                    else {
                        lst.add(lst.getLast() + n2);
                        System.out.printf("Сумма чисел %.1f \n", lst.getLast());}
                } else if (oper.equals("-")) {
                    if (lst.size() < 1) {
                        lst.add(n1 - n2);
                        System.out.printf("Разность чисел %.1f \n", lst.getLast());}
                    else {
                        lst.add(lst.getLast() - n2);
                        System.out.printf("Разность чисел %.1f \n", lst.getLast());}
                } else if (oper.equals("*")) {
                    if (lst.size() < 1) {
                        lst.add(n1 * n2);
                        System.out.printf("Произведение чисел %.1f \n", lst.getLast());}
                    else {
                        lst.add(lst.getLast() * n2);
                        System.out.printf("Произведение чисел %.1f \n", lst.getLast());}
                } else if (oper.equals("/") && n2 != 0) {
                    if (lst.size() < 1) {
                        lst.add(n1 / n2);
                        System.out.printf("Частное чисел %.2f \n", lst.getLast());}
                    else {
                        lst.add(lst.getLast() / n2);
                        System.out.printf("Частное чисел %.2f \n", lst.getLast());}
                }
            }
            else
                System.out.println("Нет такой операции");
        }
        in.close();
    }
}
