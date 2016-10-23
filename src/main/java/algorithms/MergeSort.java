package algorithms;

import java.util.Arrays;

/**
 * Created by florakalisa on 10/22/16.
 * Time complexity : O(nlog(n))
 * Space complexity : O(n)
 */
public class MergeSort {

    public static void main(String[] args) {

        int[] myArray = new int[]{3, 1, 7, 4, 5, 8, 2};

        mergesort(myArray);

    }

    private static void mergesort(int[] table) {
        int[] tmp = new int[table.length];

        mergesort(table, tmp, 0, table.length);
    }

    private static void mergesort(int[] table, int[] tmp, int start, int end) {
        if (start > end) {
            return;
        }

        int middle = (start + end) / 2;

        mergesort(table,tmp ,start, middle);
        mergesort(table, tmp,middle + 1, end);
        mergeHalves(table, tmp, start, end);


    }

    private static void mergeHalves(int[] table, int[] tmp, int leftstart, int rightend) {

        int leftend = (leftstart + rightend) / 2;
        int rightstart = leftend + 1;

        int size = rightend - leftstart + 1;

        int index = leftstart;
        int left = leftstart;
        int right = rightstart;
        while (left <= leftend && right <= rightend) {
            if (table[left] <= table[right]) {
                tmp[index] = table[left];
                left++;
            } else {
                tmp[index] = table[right];
                right++;
            }
            index++;

        }

        System.arraycopy(table, left, tmp, index, leftend-left+1);
        System.arraycopy(table, right, tmp, index, rightend-right+1);
        System.arraycopy(tmp, leftstart, table, leftstart, size);


    }

}
