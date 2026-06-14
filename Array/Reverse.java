package Array;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 8,4,2,1,5,6} ;
        int i = 0;  // To reverse an array part ...just only change the intialisation index of i and j.
        int n = arr.length;
        int j = n-1;
        int temp = 0;
        while(i<j)
        {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
        }

        //Approach 2
        // int n = arr.length;
        // int temp = 0;
        // for (int i = 0; i < n/2; i++) {
        //     temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp; 
        // }
        for (int ele : arr)
        {
            System.out.println(ele + " ");
        }
        }
        
    }
    

