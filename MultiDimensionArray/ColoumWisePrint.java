package MultiDimensionArray;

public class ColoumWisePrint {
           public static void main(String[] args) {
            int [][] a = { {1,2,3},{ 10,11,5},{ 6,9,0}};
            for (int j = 0; j < a[0].length; j++) {
                for (int i = 0; i < a.length; i++) {
                    System.out.print(a[i][j] + " ");
                    
                }
                System.out.println(" ");
                
            }
           }
}
