package java_seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
public class task_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{3544,444,63,435,52,6,25,15,45};
        String file_name = "bubble_sort.txt";
        File f = new File(file_name);
        try(FileWriter writer = new FileWriter(f, false)) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
                writer.write(Arrays.toString(arr) + "\n");
            }
            writer.close();
            System.out.println("Успешно");
        }
        catch(Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }
}

