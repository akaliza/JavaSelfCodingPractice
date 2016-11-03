package challenge;

import java.util.Arrays;

/**
 * Created by florakalisa on 11/2/16.
 */
public class MakeAnagrams {

    public static void main(String[] args) {


        String value1 = "cde";

        String value2 = "abc";


        System.out.println(calculate(value1, value2));
    }

    public static int calculate(String value1, String value2){
        StringBuilder stringBuilder1 = new StringBuilder(value1);
        StringBuilder stringBuilder2 = new StringBuilder(value2);


        mainloop:
        for(int i =0; i< stringBuilder1.length();i++){
            char tmp = value1.charAt(i);
            for(int j =0; j< stringBuilder2.length();j++){
                if(value2.charAt(j)==tmp){
                    stringBuilder1.deleteCharAt(i);
                    stringBuilder2.deleteCharAt(j);
                    continue mainloop;
                }
            }


        }

     ;

        return stringBuilder1.length() + stringBuilder2.length();

    }
}
