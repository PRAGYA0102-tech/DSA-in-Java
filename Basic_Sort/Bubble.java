package Basic_Sort;
public class Bubble{
    public static void main(String[] args) {
        int [] a = { -1, 0 ,7,5,4,3,2,4};
        int n = a.length;
        for(int i = 0 ; i < n-1 ; i++){
            int swap = 0;
            for ( int j = 0 ; j < n-1-i ; j++){
                if(a[j] > a[j+1]){  //for descending order : if(a[j] > a[j+1])
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swap ++;
                    
                }
            } 
            if( swap == 0) break;
        }
        print(a);
    }
    public static void print (int [] a){
        for( int ele : a){
            System.out.print(ele + " ");
        }
    }
}