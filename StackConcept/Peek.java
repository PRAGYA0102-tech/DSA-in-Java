package StackConcept;

import java.util.Scanner;
import java.util.Stack;

public class Peek {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        Stack <Integer> st2 = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index to peek:" );
        int idx = sc.nextInt();
        while(st.size() > idx+1){
            st2.push(st.pop());
        }
        System.out.println("Element is at " + idx + ":"+ st.peek());
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
    
}
