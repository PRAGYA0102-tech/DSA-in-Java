package StackConcept;

import java.util.Stack;

public class BottomtoTop {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        Stack <Integer> st2 = new Stack<>();
        while(st.size()>0){
         st2.push(st.pop());}
         
        while(st2.size()>0){
            int top = st2.pop();
         System.out.println(top);
         st.push(top);

        }
    }
    
}
