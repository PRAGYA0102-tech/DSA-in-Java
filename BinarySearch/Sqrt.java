package BinarySearch;

public class Sqrt {
    public static void main(String[] args) {
        int x = 16;
        int res = mySqrt(x);
        System.out.println("Squareroot: " + res);
    }
     public static  int mySqrt(int n) {
        long l = 0 , h = n;
        while(l<=h){
            long mid = l + (h-l)/2;
            if(mid * mid == n) return (int)mid;
            else if (mid * mid > n) h = mid-1;
            else l = mid + 1;

        }
        return (int)h;
        
    }
    
}
