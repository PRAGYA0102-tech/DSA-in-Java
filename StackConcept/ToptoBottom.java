package StackConcept;

import java.util.Stack;

public class ToptoBottom {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        Stack <Integer> st2 = new Stack<>();
        while(st.size()>0){
            int top = st.pop();
            System.out.println(top);
            st2.push(top);

        }
        while (st2.size()>0){
            st.push(st2.pop());
        }
    }
    
}
