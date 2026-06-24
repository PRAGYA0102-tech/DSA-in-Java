package MultiDimensionArray;

public class Transporse {
    public static void main(String[] args) {
         int [][] a = { {1,2,3},{ 10,11,5},{ 6,9,0}};
         print(a);
         System.err.println("******************************************************************");
         //Transporse
         for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < i ; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
                
            }
             
         }
         print(a); 

    }
    public static void print (int [][] a){
        for(int [] e : a){ 
        for(int elem : e){
                System.out.print(elem + " ");

        }
        System.out.println("");
     }
    }

    
}
