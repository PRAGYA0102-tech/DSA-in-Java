package BinarySearch;

public class pos_neg {
    public static void main(String[] args) {
        int [] a = { -3,-2,-1,0,0,0,1,2,3,4};
        int n = a.length;
        int l = 0 , h = a.length-1;
        while (l<=h){
            int m = l + (h-l)/2;
            if (a[m] >= 0) h = m-1;
            else l = m+1;
        }
        int negcount = l;

         l = 0 ; h = a.length-1;
        while (l<=h){
            int m = l + (h-l)/2;
            if (a[m] <= 0) l = m+1;
            else  h = m-1;
        }
        int poscount = n-l;
        int res = Math.max(negcount,poscount);
        System.out.println(res);

    }
    
}
