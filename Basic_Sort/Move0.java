package Basic_Sort;

public class Move0 {
    public static void main(String[] args) {
        
  
    //I can use bubble sort in it ,the condition of swap willbe if(a[j]==0)--> swap

    int [] a = { -1, 0 ,7,0,4,0,2,4};
    int n = a.length;
    int j =0;
    for( int i = 0 ; i < n ; i++){
        if(a[i] != 0){
            if(i != j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
            j++;
        }
    }
    for( int ele : a){
            System.out.print(ele + " ");
        }
    
}
  }
