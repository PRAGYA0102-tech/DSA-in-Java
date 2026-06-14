package Array;

public class PassByValue {
    public static void main(String[] args) {
        int[] a = {2,4,7,9};
        System.out.println(a[1]); //4
        changeArray(a);
        System.out.println(a[1]); //Change hogi value. 8
    }
    public static void changeArray(int[]x)
    {
        x[1] = 8;
    }
    
}
