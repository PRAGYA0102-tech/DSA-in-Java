package Array;

import java.util.Collections;
import java.util.Vector;

public class Addone {
    public static void main(String[] args) {
        int [] a = { 9,8,7,9};
        Vector <Integer> ans = new Vector<>();
        int n = a.length;
        int c =1;
        
        for (int i = n-1; i >= 0; i--) {
            
            if(a[i] + c <= 9 ){
                ans.add(a[i] + c);
                c=0;
            }
            else{
                ans.add(0);
                c=1;
            }
                   }
         if(c==1) ans.add(1);          
        Collections.reverse(ans);
         System.out.print(ans);
        

            
        }



    }

