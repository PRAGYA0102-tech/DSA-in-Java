package StackConcept;

import java.util.Stack;

public class ParanthesisCheck {
    public static void main(String[] args) {
        String s = "({[])";
        boolean res =  isBalanced(s);
        System.out.println(res);

        
    }
    public static boolean  isBalanced(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            Character ch = s.charAt(i);
            if ( ch == '(' || ch =='{' || ch =='[') st.push(ch);
            else{
                if(st.size()==0) return false;
                Character top = st.peek();
                if(SameStyle(top,ch)) st.pop();
                else return false;

            }
            
        }
      return(st.isEmpty());  
    }
    public static boolean SameStyle(Character a , Character b){
        if( a== '(' && b==')') return true;
        if( a== '[' && b==']') return true;
        if( a== '{' && b=='}') return true;
        return false;
    }
    
}
