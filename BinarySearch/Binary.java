package BinarySearch;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int [] a = {9,4,7,1,8,3,2};
        Arrays.sort(a);
        int idx = -1;
        int t = 1;
        int l = 0 , h = a.length - 1;
        while(l <= h){
            int mid = (l+h)/2;
            if (a[mid] > t) h= mid-1;
            else if (a[mid] < t) l = mid +1;
            else {
                idx = mid;
                 break;
        }
    }
    if (idx != -1){
        System.out.println("Element found at index :" + idx);
    }
    else{
        System.out.println("Element not found");
    }
    
}

}
