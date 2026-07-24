package BinarySearch;
public class floor {
    public static void main(String[] args) {
        int [] a = {0,1,2,3,4,4,6};
        int t = 5;
        int l = 0 , h = a.length-1;
        int idx = -1;
        while( l<= h){
            int mid = l + (h-l)/2;
            if(a[mid] > t) h = mid-1;
            else{
                idx = mid;
                l = mid+1;
            } 
        }
        System.out.println(idx);
    }
    
}
