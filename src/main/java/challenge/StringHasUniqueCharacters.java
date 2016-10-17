package challenge;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by florakalisa on 10/17/16.
 * String : ASCII string or Unicode String
 * ASCII is composed of 128 characters, extended ASCII is composed of 256 characters
 * Time complexity : O(n) with n the length of the string
 * Space complexity : O(1)
 * other versions : compare every character to other characters, sort the array and compare characters which are next to each other
 */
public class StringHasUniqueCharacters {

    public static void main(String[] args) {

        String example1 = "abcdefg";
        String example2 = "amalgam";

        System.out.println(hasUniqueCharacters_version1(example1));
        System.out.println(hasUniqueCharacters_version1(example2));
        System.out.println("--------------------------------------");
        System.out.println(hasUniqueCharacters_version2(example1));
        System.out.println(hasUniqueCharacters_version2(example2));
        System.out.println("--------------------------------------");
        System.out.println(hasUniqueCharacters_version3(example1));
        System.out.println(hasUniqueCharacters_version3(example2));

    }

    //version 1
    public static boolean hasUniqueCharacters_version1(String value){
        Set<Integer> set = new HashSet<Integer>();
        for(int i =0; i < value.length(); i++){
            int tmp =  value.charAt(i);
            if(set.contains(tmp)){
                return false;
            }else{
                set.add(tmp);
            }
        }
        return true;

    }

    //version 2
    public static boolean hasUniqueCharacters_version2(String value){

        if(value.length()> 128){
            return false;
        }

        boolean [] flagArray = new boolean[128];

        for(int i = 0; i< value.length(); i++ ){
            int tmp = value.charAt(i);
            if(flagArray[tmp]==true){
                return false;
            }else{
                flagArray[tmp] = true;
            }
        }
        return true;
    }


    //version 3
    public static boolean hasUniqueCharacters_version3(String value){
        int checker = 0;
        for(int i = 0; i< value.length(); i++ ){
            int val = value.charAt(i)-'a';
            if((checker & (1 << val))>0){
                return false;
            }
                checker |= (1<< val);
        }
        return true;
    }
}
