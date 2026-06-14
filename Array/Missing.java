package Array;

import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();           
        }
        int res = miss(n,arr);
        System.out.println("Missing value: " + res);
        
        
    }
    public static int miss(int n , int [] arr)
    {
        int m = n+1;
        int sum = m*(m+1)/2;
        int Asum=0;
        for (int i = 0; i < n; i++) {
            Asum += arr[i];
        }
             
        return sum-Asum;    
        
    
}
}
