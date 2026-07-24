package BinarySearch;

public class Mountain {
    public static void main(String[] args) {
        int [] a = { -1 , 0 , 1 , 8 , 7, 7,6};
        int l = 1 , h = a.length-2;
        while ( l <= h){
            int mid = l + (h-l)/2;
            if(a[mid] > a[mid-1] && a[mid] < a[mid+1]) l = mid + 1;
            else if (a[mid] < a[mid-1] && a[mid] > a[mid+1]) h = mid -1;
            else 
            { System.out.println("Peak element will be : " + a[mid]);
                break;
            }
        }
    }
    
}
