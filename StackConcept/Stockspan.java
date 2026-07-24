package StackConcept;

import java.util.Stack;

public class Stockspan {
    public static void main(String[] args) {
        int [] a = {100,80,60,100,70,75,90};
        int[] res = Span(a);
        for(int e : res){
            System.out.print(e + " ");
        }

    }
    public static int[] Span(int[] a){
        int n = a.length;
        int[] b = new int[n];
        Stack<Integer> st = new Stack<>();
        b[0] = 1;
        st.push(0);
        for(int i=1; i<n ; i++){
            while(st.size()>0 && a[i]>=a[st.peek()]) st.pop();
            if(st.size()==0) b[i] = i-(-1);
            else b[i]= i-st.peek();
            st.push(i);
        }
        return b;


    }
    
}
