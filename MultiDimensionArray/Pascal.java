package MultiDimensionArray;

import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        int n = 5;
       System.out.println(generate(n));
    //    List <List <Integer>> res = generate(n);
    //    System.out.println(res);
    }
         
    // public  static List<List<Integer>> generate(int n) {
    //     List<List<Integer>> ans = new ArrayList<>();
        // for(int i =0 ; i < n; i++){
        //     ans.add(new ArrayList<Integer>());
        //     for(int j =0;j<=i; j++){
        //         if(j==0 || j == i) ans.get(i).add(1);
        //         else{
        //             int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
        //             ans.get(i).add(val);
        //         }
        //     }
            
        // }
        //  return ans;

        //Method 2
        public  static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list.add(1);
                
            }
            ans.add(list);          
        }
        for (int i = 0; i < n; i++) {
            
            for(int j = 1;j < i; j++){
                
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).set(j,val);
                }
            }
     return ans;
        
    }
    
}
