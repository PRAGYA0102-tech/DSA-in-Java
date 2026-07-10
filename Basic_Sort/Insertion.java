package Basic_Sort;

public class Insertion {
    public static void main(String[] args) {
        int a[] = { 1,5,6,2,4,4};
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while(j > 0 && a[j] < a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
            
        }
        for( int ele : a){
            System.out.print(ele + " ");
        }
    }
    
}
