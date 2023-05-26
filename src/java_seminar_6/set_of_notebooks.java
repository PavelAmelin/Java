package java_seminar_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class set_of_notebooks {
    public static void main(String[] args) {
        ArrayList<notebook_data> list_notebooks = new ArrayList<>();
        list_notebooks.add(new notebook_data("Lenovo G580", 4, 256, "Windows7", "black"));
        list_notebooks.add(new notebook_data("Asus X550C", 32, 1024, "Windows10", "gold"));
        list_notebooks.add(new notebook_data("HP 530", 8, 512, "Windows8", "grey"));
        list_notebooks.add(new notebook_data("Acer Aspire 5750G", 16, 512, "Windows11", "white"));
        list_notebooks.add(new notebook_data("Dell Latitude 5500", 8, 256, "Linux", "silver"));
        list_notebooks.add(new notebook_data("Apple MacBook Pro 16", 32, 1024, "MacOS", "white"));
        System.out.println("Здравстствуйте, введите цифру, соответствующую необходимому критерию");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<String, Object> list_param = new HashMap<>();
        if (n == 1){
            System.out.println("Введите минимальный объем ОЗУ: ");
            int min_ram = scanner.nextInt();
            list_param.put("ram", min_ram);
        } else if (n == 2) {
            System.out.println("Введите минимальный объем ЖД: ");
            int min_hdd = scanner.nextInt();
            list_param.put("hdd", min_hdd);
        } else if (n == 3) {
            System.out.println("Введите операционную систему: ");
            String os = scanner.next();
            list_param.put("os", os);
        } else if (n == 4) {
            System.out.println("Введите цвет: ");
            String color = scanner.next();
            list_param.put("color", color);
        }else
            System.out.println("Этой цифре не соответствует ни один критерий");
        scanner.close();

        ArrayList<notebook_data> fltr_list_notebook = new ArrayList<>();
        for (notebook_data notebook: list_notebooks){
            for (Map.Entry<String, Object> param: list_param.entrySet()) {
                if (param.getKey().equals("ram") && notebook.get_ram() >= (int) param.getValue())
                    fltr_list_notebook.add(notebook);
                else if (param.getKey().equals("hdd") && notebook.get_hdd() >= (int) param.getValue())
                    fltr_list_notebook.add(notebook);
                else if (param.getKey().equals("os") && notebook.get_os().equals(param.getValue()))
                    fltr_list_notebook.add(notebook);
                else if (param.getKey().equals("color") && notebook.get_color().equals(param.getValue()))
                    fltr_list_notebook.add(notebook);
            }
        }
        if (fltr_list_notebook.isEmpty())
            System.out.println("Нет ноутбуков с такими параметрами");
        else {
            System.out.println("Ноутбуки: ");
            for (notebook_data notebook: fltr_list_notebook)
                System.out.println(notebook.get_name_brand());
        }
    }
}
