package java_seminar_3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        int[] our_arr = new int[]{3321, 123, 13, 12, 1321, 41234, 436, 36, 546, 89, 567, 45, 45235, 325, 256, 876};
        for (int v : sorting(our_arr))
            System.out.println(v);
    }
    private static int[] merge_list(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] res = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                i++;
            } else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        return res;
    }
    private static int[] sorting(int[] arr) {
        int mid = arr.length / 2;
        if (arr.length > 1) {
            int[] half1 = Arrays.copyOfRange(arr, 0, mid);
            int[] half2 = Arrays.copyOfRange(arr, mid, arr.length);
            return merge_list(sorting(half1), sorting(half2));
        } else
            return arr;
    }
}
