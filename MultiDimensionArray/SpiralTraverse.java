package MultiDimensionArray;

import java.util.ArrayList;

public class SpiralTraverse {
    public static void main(String[] args) {
        System.out.println("");
        int [][] a = { {1,2,3}, { 4,5,6},{7,8,9}, { 10,11,12}};
        System.out.println(spiral(a));
        
    }
    public static  ArrayList<Integer>  spiral(int [][] arr){
        ArrayList <Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int fr = 0, fc = 0, lr = m-1, lc = n-1;
        int tne = m * n;
        int i,j;
        while(ans.size ()< tne){
            for(j = fc ; j<=lc ; j++) //right
                ans.add(arr[fr][j]);
            fr++;
            if(ans.size() == tne) break; 

            for(i = fr ; i<= lr ; i++) //down
                ans.add(arr[i][lc]);
            lc--;
            if(ans.size() == tne) break; 

            for(j = lc ; j>= fc ; j--) //left
                ans.add(arr[lr][j]);
            lr--;
            if(ans.size() == tne) break; 

            
            for(i = lr ; i >= fr ; i--) //up
                ans.add(arr[i][fc]);
            fc ++;
            if(ans.size() == tne) break; 
   }
        return ans;
    }
    
}
