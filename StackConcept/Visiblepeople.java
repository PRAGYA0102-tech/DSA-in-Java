package StackConcept;

import java.util.Stack;

public class Visiblepeople {
    public static void main(String[] args) {
        int [] a = { 10,6,8,5,11,9};
        int[] res = canSeePersonsCount(a);
        for(int e : res){
            System.out.print(e + " ");
        }
    }
        public static  int[] canSeePersonsCount(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[n-1] = 0;
        st.push(a[n-1]);
        for(int i=n-2;i>=0;i--){
            int count=0;
            while(st.size()>0 && a[i]>=st.peek()){
                count++;
                st.pop();
            }
            if(st.size()>0) count++;
            ans[i] = count;
            st.push(a[i]);
        }
       return ans; 
        
    }
    
    
}
