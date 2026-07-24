package StackConcept;

import java.util.Stack;

public class Celebrity {
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 0},{0, 1, 0},{0, 1, 1}};
        int cel = celebrity(mat);
        System.out.println("Celebrity is:" + cel);
    }
    public static int celebrity(int[][] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);     
        }
        int a = st.pop();
        int b = st.pop();
         boolean aflag = true,bflag = true;
         if(arr[a][b]== 1 || arr[b][a]==0) aflag = false; //a celeb nhi h
         if(arr[b][a]== 1 || arr[a][b]==0) bflag = false; //a celeb nhi h
         if(aflag) st.push(a);
         if(bflag) st.push(b);

         if(st.size()==0) return -1;
            int celeb = st.pop();
            for(int j=0 ; j<n;j++){
               if( j==celeb) continue;
               if(arr[celeb][j]==1) return -1;
            }
            for(int i=0 ; i<n;i++){
                if( i==celeb) continue;
               if(arr[i][celeb]==0) return -1;
            }
          return celeb;
         }


        }
    

    

