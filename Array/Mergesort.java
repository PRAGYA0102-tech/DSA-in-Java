package Array;

public class Mergesort {
    public static void main(String[] args) {
        int[] a = { 2,3,6,9};
        int [] b = {1,4,5,8,10 };
        int [] c = new int[a.length + b.length];
        int i=0,j=0,k = 0;
        while(i<a.length && j < b.length){
            c[k++] = (a[i]< b[j]) ? a[i++] : b[j++];
        }
        while(j< b.length){
            c[k++] = b[j++];
        }
         while(i< a.length){
            c[k++] = a[j++];
        }
        for ( int eme : c)
        {
            System.out.print(eme + " ");
        }
    }
    
}
