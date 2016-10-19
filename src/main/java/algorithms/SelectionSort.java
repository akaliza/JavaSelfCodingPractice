package algorithms;

import com.sun.tools.javac.resources.compiler;

import java.util.Arrays;

/**
 * Created by florakalisa on 10/19/16.
 */
public class SelectionSort {

    public static void main(String[] args) {


        Integer[] table ={3,5,1,5,6, 2, 7};
        System.out.println(Arrays.toString(table));
        sort(table);
        System.out.println(Arrays.toString(table));
    }


    public static void sort(Comparable[] table){

        for(int i=0; i < table.length; i++){
            for(int j=i+1; j < table.length; j++){
                if(less(table[i],table[j] )==1){
                    swap(table, i, j);
                }
            }


        }

    }

    public static void swap(Comparable []table, int i, int j){
        Comparable tmp = table[i];
        table[i] = table[j];
        table[j] = tmp;

    }


    public static int less(Comparable a, Comparable b){
        return a.compareTo(b);
    }
}
