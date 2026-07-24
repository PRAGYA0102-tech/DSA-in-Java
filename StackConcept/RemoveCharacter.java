package StackConcept;

import java.util.Stack;

public class RemoveCharacter {
    public static void main(String[] args) {
        String s = "aaabbcaa";
        String res = removeConsecutive(s);
        System.out.println(res);
    }
    public static String removeConsecutive(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            Character ch = s.charAt(i);
            if(st.isEmpty() || ch != st.peek()) st.push(ch);         

        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
         return sb.reverse().toString();
    }
    
}
