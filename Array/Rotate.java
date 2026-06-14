package Array;
public class Rotate {
    public static void main(String[] args) {
        int [] arr = { 3,6,5,4,9,8};
        int d = 2;
        int n = arr.length;
        d %= n;  //Use when d>n
         reverse(arr,0,d-1);
         reverse(arr,d,n-1);
         reverse(arr,0,n-1);
        //Approch2-
        // reverse(arr,0,n-1);
        //  reverse(arr,0,n-d-1);
        //  reverse(arr,n-d,n-1);
         for(int ele : arr)
         {
            System.out.println(ele + " ");
         }

    }
    public static void reverse(int [] a, int i , int j)
    {  int temp;
        while(i<j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

    }

}
