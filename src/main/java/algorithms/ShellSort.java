package algorithms;

import java.util.Arrays;

/**
 * Created by florakalisa on 10/22/16.
 * in 1959
 * se insertion sort but instead of going back 1 at time, we go by H
 * Inefficient
 * Time complexity :
 * Space complexity :
 */
public class ShellSort {


    public static void main(String[] args) {
        Integer[] table = new Integer[]{3, 1, 4, 7, 5, 9};
        System.out.println(Arrays.toString(table));
        sort(table);
        System.out.println(Arrays.toString(table));
    }

    public static void sort(Comparable[] table) {

        int N = table.length;
        int h = 1;

        while (h < N / 3) h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < table.length; i++) {
                for (int j = i; j >= h && less(table[j], table[j - h]) == -1; j-=h) {
                        swap(table, j, j - h);
                    }

            }
            h= h/3;
        }
    }

    private static void swap(Comparable[] table, int i, int j) {
        Comparable tmp = table[i];
        table[i] = table[j];
        table[j] = tmp;
    }


    private static int less(Comparable a, Comparable b) {
        return a.compareTo(b);
    }
}
