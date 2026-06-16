package Array;

public class Segragate {
    public static void main(String[] args) {
        // Main method implementation
        int[] a = { 1, 0, 1, 0, 1, 0 };
        
        int n = a.length;
        int i=0,j=n-1;
        while ( i<j ){
            if (a[i] == 0) i++;
            if (a[j] == 1) j--;
            if(i>j) break;
            if (a[i] == 1 && a[j] == 0 )
                {
                    a[i]=0;
                    a[j] = 1;
                    i++;
                    j--;
                } 

        }
         for( int elem : a)
         {
            System.out.print( elem + " ");
         }
            
        }
            
        
    }

