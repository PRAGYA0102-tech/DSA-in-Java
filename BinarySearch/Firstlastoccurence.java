package BinarySearch;

public class Firstlastoccurence {
    public static void main(String[] args) {
        int [] a = { 1,1,2,3,3};
        int t = 3;
        int [] ans = {-1 , -1};
        int idx = -1;
        int l = 0 , h = a.length-1;
        while (l <= h){
            int mid = l + (h-l)/2;
            if(t > a[mid]) l = mid +1;
            else if ( t < a[mid] ) h = mid -1;
            else {
                idx = mid;
                h = mid -1;
            }
        }
        ans[0] = idx;
         idx = -1;
         l = 0 ;  h = a.length-1;
        while (l <= h){
            int mid = (l+h)/2;
            if(t > a[mid]) l = mid +1;
            else if ( t < a[mid] ) h = mid -1;
            else {
                idx = mid;
                l = mid + 1;
            }
        }
        ans[1] = idx;
        for( int e : ans){
            System.out.print(e + " ");
        }
        
    }
    
}
