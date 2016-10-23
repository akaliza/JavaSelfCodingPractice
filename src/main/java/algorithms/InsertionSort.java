package algorithms;

import java.util.Arrays;

/**
 * Created by florakalisa on 10/19/16.
 * Time complexity : best case(ascending order) : N-1 compares and 0 exchanges, worse case(descending order) : N*N/2 compares and exchanges
 * Space complexity :
 */
public class InsertionSort {

    public static void main(String[] args) {
        Integer[] table = new Integer []{3, 1, 4, 7, 5, 9 };
        System.out.println(Arrays.toString(table));
        sort(table);
        System.out.println(Arrays.toString(table));
    }

    public static void sort(Comparable[] table){

        for(int i =0; i < table.length; i++ ){
            for(int j = i ; j > 0; j--){
                if(less(table[j],table[j-1])==-1){
                    swap(table, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    private static void swap(Comparable []table, int i, int j){
        Comparable tmp = table[i];
        table[i] = table[j];
        table[j] = tmp;
    }


    private static int less(Comparable a, Comparable b){
        return a.compareTo(b);
    }

}
