package StackConcept;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] s = {"5","4","C","D","+","2"};
        int res = Game(s);
        System.out.println("CallPoints: " + res );
    }
    public static int Game(String[] a){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            String sc = a[i];
            if(sc.equals("C")) st.pop();
            else if (sc.equals("D")) st.push(2*st.peek());
            else if (sc.equals("+")) {
                int top = st.pop();
                int secondtop = st.peek();
                int sum = top + secondtop;
                st.push(top);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(sc));
            }
            
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;

    }
    
}
