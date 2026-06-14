package pattern;
import java.util.Scanner;

public class TPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        // for (int i = 0; i < r ; i++) {
        //     for (int j = 0; j <= r-i; j++) {  //i+j = r
        //         System.out.print("*" + " ");    
        //     }
        //     System.out.println("");
            
        // }
        System.out.println("*****************************************************************************************");
        // for (int i = 0; i < r ; i++) {
        //     for (int j = r; j > i; j--) {  
        //         System.out.print("*" + " ");    
        //     }
        //     System.out.println("");
            
        // }
         System.out.println("*****************************************************************************************");
        int a=r;
         for (int i = 0; i < r ; i++) {
            for (int j = 0; j <a; j++) {  //i+j = r
                System.out.print("*" + " ");
                 
            }
            a--;   
            System.out.println("");
            
        }
        
        sc.close();
    }
    
}
