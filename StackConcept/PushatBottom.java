package StackConcept;

import java.util.Stack;

public class PushatBottom {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        int e = -1;
        pushatbottom(st,e);
        System.out.println(st);
    }
    public static void pushatbottom(Stack<Integer> st , int e){
        if(st.isEmpty()){
            st.push(e);
            return;
        }

        int top = st.pop();
        pushatbottom(st,e);
        st.push(top);

    }
    
}
