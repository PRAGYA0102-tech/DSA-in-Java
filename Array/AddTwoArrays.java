package Array;
import java.util.*;

public class AddTwoArrays {
    public static Vector<Integer> addTwoArrays(int[] A1, int[] A2) {
        Vector<Integer> ans = new Vector<>();
        int i = A1.length - 1;
        int j = A2.length - 1;
        int carry = 0;

        // Traverse both arrays from back to front
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Add digit from A1 if it exists
            if (i >= 0) {
                sum += A1[i];
                i--;
            }

            // Add digit from A2 if it exists
            if (j >= 0) {
                sum += A2[j];
                j--;
            }

            // Get the digit and update carry
            ans.add(sum % 10);
            carry = sum / 10;
        }

        // Reverse to get the correct number order
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] A1 = {3, 5, 6, 9};
        int[] A2 = {2, 9, 1};

        Vector<Integer> result = addTwoArrays(A1, A2);
        
        System.out.println("Result: " + result);
    }
}