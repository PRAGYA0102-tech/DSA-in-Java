
package Basic_Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Commonele {
    public static void main(String[] args) {
        int[] a = {1, 5, 4, 4, 9};
        int[] b = {9, 4, 4, 8};
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
