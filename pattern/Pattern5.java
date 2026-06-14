package pattern;
import java.util.Scanner;

public class Pattern5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();
        int num = 65;
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                System.out.print((char)num + " "); //(char)(j+65)
            }
            num++;     
            
            System.err.println("");
            
        }
        sc.close();


    }
}
