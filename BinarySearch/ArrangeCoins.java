package BinarySearch;

import java.util.Scanner;

public class ArrangeCoins {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the number of coin : ");
       int n = sc.nextInt();
        long m = n;
        int k = (Sqrt(8*m + 1)-1)/2;
        System.out.println("Number of filled rows:" + k);
    }
public static int Sqrt(long n) {
        if(n==0) return 0;
        long l = 0 , h = n;
        while(l<=h){
            long mid = l + (h-l)/2;
            if(mid == n/mid) return (int)mid;
            else if (mid  > n/mid) h = mid-1;
            else l = mid + 1;

        }
        return (int)h;
        
    }
    
}
