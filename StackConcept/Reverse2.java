package StackConcept;

import static StackConcept.PushatBottom.pushatbottom;
import java.util.Stack;

public class Reverse2 {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        Reverse(st);
        System.out.println(st);
    }
    public  static void Reverse (Stack<Integer> st){
        if(st.size() <= 0){
            return;
        }
        int top = st.pop();
        Reverse(st);
        pushatbottom(st , top);
    }
    
}
