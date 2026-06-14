package Array;

import java.util.Arrays;

public class DeepShallow {
    public static void main(String[] args) {
        //Shallow Copy
        int [] arr1 = { 6,4,5,8};
        int [] x = arr1;
        x[0] = 100;
        System.out.println(arr1[0]); //100

        //Deep Copy
        int [] arr2 = {9,6,2,1};
        int[] deep = Arrays.copyOf(arr2,4);
        deep[0] = 100;
        System.out.println(arr2[0]); //9


    }
}
