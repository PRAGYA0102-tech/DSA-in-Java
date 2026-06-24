package MultiDimensionArray;

public class rotateimage {
    public static void main(String[] args) {
        int [][] a = { {1,2,3},{ 10,11,5},{ 6,9,0}};
        rotate(a);
        print (a);
    }
    //Transpose
    public static  void rotate(int[][] a) {
        for( int i = 0 ; i < a.length ; i++){
            for (int j = 0 ; j < i ; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }
        }
        //Reverse
         for( int i = 0 ; i < a.length ; i++){
            int stcl = 0 , edcl = a[0].length-1;
            while(stcl < edcl)
            {
                int temp = a[i][stcl];
                a[i][stcl] = a[i][edcl];
                 a[i][edcl] = temp;
                 stcl ++ ;
                 edcl --;
                
            }  
         }     
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
    

