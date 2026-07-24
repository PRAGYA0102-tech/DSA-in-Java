package StackConcept;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse1 {
    public static void main(String[] args) {
        //Method1 is to use 2 extra stack 
        //This is Method2
        Stack <Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        ArrayList<Integer> a = new ArrayList<>();
        while(st.size() > 0){
            int top = st.pop();
            a.add(top);
        }
        for(int i = 0 ; i < a.size() ; i ++ ){
            int e = a.get(i);
            st.push(e);
        }
        System.out.println(st);
    }
    
}
