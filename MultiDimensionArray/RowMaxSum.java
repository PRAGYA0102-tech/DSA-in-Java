package MultiDimensionArray;

public class RowMaxSum {
    public static void main(String[] args) {
        int [][] a = { { 1,5,6}, { 10,5,9}, { 2,4,0}};
        int maxsum = 0;
        int sum;
        int row=0;
        for (int i = 0; i < a.length; i++) {
            sum = 0;
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
               
                
            }
            //maxsum = Math.max(maxsum, sum);
            if (sum > maxsum){
             maxsum = sum;
              row = i;
            }
           
            
        }
        System.out.println( "Index: " + row +" MaxSum "+ maxsum);

    }
    
}
