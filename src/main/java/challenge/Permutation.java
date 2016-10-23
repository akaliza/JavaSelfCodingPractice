package challenge;

import java.util.Arrays;

/**
 * Created by florakalisa on 10/17/16.
 * "sumit" and "tiums" are permutations of each other.
 * "abcd" and bdea" are not permutations of each other.
 * Questions : white space ? case sensitive ?
 */
public class Permutation {

    public static void main(String[] args) {

        //

        System.out.println(arePermutation1("sumit", "tiums"));
        System.out.println(arePermutation1("abcd", "bdea"));


    }


    public void getAllPermutation(String value) {

    }

    private static boolean arePermutation1(String value1, String value2) {

        if (value1 == null || value2 == null) {
            throw new IllegalArgumentException();
        } else if (value1.length() != value1.length()) {
            return false;
        } else {
            char[] value1Array = value1.toCharArray();
            char[] value2Array = value2.toCharArray();

            Arrays.sort(value1Array);
            Arrays.sort(value2Array);

            return String.valueOf(value1Array).equals(String.valueOf(value2Array));
        }
    }

    private static boolean arePermutation2(String value1, String value2) {

        if (value1 == null || value2 == null) {
            throw new IllegalArgumentException();
        } else if (value1.length() != value1.length()) {
            return false;
        } else {

            int[] tab = new int[128];

            for (int i = 0; i < value1.length(); i++) {
                int chartValue1 = value1.charAt(i);
                tab[chartValue1]++;


            }
            for(int i = 0; i < value1.length(); i++){
                int chartValue2 = value2.charAt(i);
                tab[chartValue2]--;
                if(tab[chartValue2] < 0){
                    return false;
                }
            }
            return true;
        }

    }

}
