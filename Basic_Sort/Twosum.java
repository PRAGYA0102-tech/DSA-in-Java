package Basic_Sort;

import java.util.ArrayList;
import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int[] a = { 2, 4,9, 0, 7,1};
        int tar = 6;
        Arrays.sort(a);
        ArrayList<Integer> res = twosum(a,tar);
        for( int ele : res){
            System.out.print(ele + " ");
        }

    }
    public static ArrayList<Integer> twosum( int a[] , int t){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0 ; int j = a.length-1;
        while(i<j){
            if(a[i] + a[j] == t) {
                ans.add(i);
                ans.add(j);
                i++;
                j--;
            }
            else if ( a[i] + a[j] < t) i++;
            else j--;
        }
      return ans;
        
    }
    
}
//Note - Index in the output will be different because  we first sort the array and the search the index