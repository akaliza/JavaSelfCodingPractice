package algorithms;

import com.sun.tools.javac.resources.compiler;

import java.util.Arrays;

/**
 * Created by florakalisa on 10/19/16.
 * The idea : in iteration i, find index min of the smallest remaining, swap a[i] and a[min]
 * Time complexity : Quadratique = N*N/2 compares, N exchanges
 * Space complexity :
 * Invariant : entries to the left of i fixed and in ascending order
 *             No entry to the right of i is smaller than any entry to the left of i
 *
 */
public class SelectionSort {

    public static void main(String[] args) {
        Integer[] table = {3, 5, 1, 5, 6, 2, 7};
        System.out.println(Arrays.toString(table));
        SelectionSort.sort(table);
        System.out.println(Arrays.toString(table));
    }


    public static void sort(Comparable[] table) {

        for (int i = 0; i < table.length; i++) {
            int min = i;
            for (int j = i + 1; j < table.length; j++) {
                if (less(table[j], table[min]) == -1) {
                    min = j;
                }
            }
            swap(table, i, min);
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
