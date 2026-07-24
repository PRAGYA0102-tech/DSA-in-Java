package StackConcept;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] a = {1,4,2,1,9,5,8};
        int [] res = nge(a);
        for(int e : res){
            System.out.print(e + " ");
        }
    }
    public static int[] nge(int [] a){
        int n = a.length;
        int [] b = new int[n];
        Stack<Integer> st = new Stack<>();
        b[n-1] = -1;
        st.push(a[n-1]);
        for (int i = n-2; i >=0; i--) {
            while(st.size()> 0 && a[i]>= st.peek()) {
                st.pop();
            }
            if(st.size()== 0) b[i] = -1;
            else b[i] = st.peek();
            st.push(a[i]);
            
        }
        return b;

    }
    
}
