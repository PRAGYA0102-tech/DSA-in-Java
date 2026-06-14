package methods;

import java.util.Scanner;

public class PerCom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int n = sc.nextInt();
        int r =  sc.nextInt();

        int per = fact(n)/fact(n-r);
        int com = fact(n)/fact(n-r) * fact(r);
        System.out.println( "Permutation:" + per);
        System.out.println( "Combination: " + com);
        
    }
    public static int fact(int x){
       int f=1;
       for(int i=1;i<=x;i++)
       {
        f*=i;
       }
     return f;   
    }
    
}
