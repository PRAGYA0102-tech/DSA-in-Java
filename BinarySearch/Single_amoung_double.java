package BinarySearch;

public class Single_amoung_double {
    public static void main(String[] args) {
        int [] a = { 1,1,2,2,3,4,4};
        int res = singleNonDuplicate(a);
        System.out.println("Non dublicate element " + res);
    }
    public static  int singleNonDuplicate(int[] a) {
        int n = a.length;
        if(n==1) return a[0];
        if(a[0] != a[1]) return a[0];
        if(a[n-1] != a[n-2]) return a[n-1];
        int l = 0 , h = n-1;
        while (l <= h){
            int mid = l + (h-l)/2;
            if(a[mid] != a[mid + 1] && a[mid] != a[mid-1] ) return a[mid];
            int f = mid , s = mid ;
            if (a[mid] == a[mid-1]) f = mid-1;
            else s = mid+1;
            int lc = f-l;
            int rc = h-s;
            if(lc % 2 == 0) l = s+1;
            else h = f-1;
        }
     return -1;   
        
    }
}
