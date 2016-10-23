package challenge;

import java.util.Arrays;

/**
 * Created by florakalisa on 10/15/16.
 * Time complexity :
 * Space complexity :
 * Example of 3 rotations :
 * 1, 2, 3, 4, 5
 * 2, 3, 4, 5, 1
 * 3, 4, 5, 1, 2
 * 4, 5, 1, 2, 3
 */
public class LeftRotation {

    public static void main(String[] args) {

        int rotationNumber = 4;

        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myArray));
        rotateToLeft(myArray, rotationNumber);
        System.out.println(Arrays.toString(myArray));

    }

    private static void rotateToLeft(int[] myArray, int rotationNumber) {
        while (rotationNumber > 0) {
            for (int i = 0; i < myArray.length - 1; i++) {
                int tmp = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = tmp;
            }
            rotationNumber--;
        }
    }
}
