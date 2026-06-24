package MultiDimensionArray;

public class SnakePrint {
    public static void main(String[] args) {
         int [][] a = { {1,2,3},{ 1,9,5},{ 6,9,0},{9,0,5}};
         for (int i = 0; i < a.length; i++) {
            if(i%2 == 0){
                for (int j = 0; j < a[0].length; j++) {
                    System.out.print(a[i][j] + " ");
                    
                }
            }
            else{
                for (int j = a[0].length-1; j >= 0 ; j--) {
                   System.out.print(a[i][j] + " ");
                    
                }
            }
            System.out.println("");
             
         }
         
    }
    
}
