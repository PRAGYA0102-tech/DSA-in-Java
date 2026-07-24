package BinarySearch;

public class Firstoccurence {
    public static void main(String[] args) {
        int [] a = {1,1,2,3,3};
        int idx = -1;
        int t = 1;
        int l = 0 , h = a.length-1;
        while (l <= h){
            int mid = (l+h)/2;
            if(t > a[mid]) l = mid +1;
            else if ( t < a[mid] ) h = mid -1;
            else {
                idx = mid;
                h = mid -1;
            }
        }
        System.out.println("Element first found at :" + idx);

    }
    
}
