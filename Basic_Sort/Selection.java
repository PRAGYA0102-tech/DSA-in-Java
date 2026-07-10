package Basic_Sort;

public class Selection {
    public static void main(String[] args) {
        int [] a ={9,4,8,2,6,1};
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if(a[j] < min){
                    min = a[j];
                    mindx=j;
                }
                
            }
            int temp = a[i];
            a[i] = a[mindx];
            a[mindx] = temp;

            
        }
          print(a);
    }
    public static void print (int [] a){
        for( int ele : a){
            System.out.print(ele + " ");
        }
    } 
  
    
}
