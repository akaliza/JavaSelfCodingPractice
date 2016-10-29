package algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by florakalisa on 10/28/16.
 * Time complexity : lineair time.
 * Space complexity :
 */
public class KnuthShuffle {

    private static Random random;

    static {
        // this is how the seed was set in Java 1.4
        long seed = System.currentTimeMillis();
        random = new Random(seed);
    }


    public static void main(String[] args) {

        Integer[] table = {5, 2, 3, 7, 8, 1};
        System.out.println(Arrays.toString(table));
        shuffle(table);
        System.out.println(Arrays.toString(table));


    }


    public static void shuffle(Integer[] a) {

        int N = a.length;

        for (int i = 0; i < N; i++) {
            int r = random.nextInt(i + 1);
            swap(a, r, i);

        }

    }

    private static void swap(Comparable[] array, int i, int j) {
        Comparable tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


}
