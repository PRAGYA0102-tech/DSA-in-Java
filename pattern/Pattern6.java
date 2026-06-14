package pattern;
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();
       
        for (int i = 0; i < n; i++) {
             char ch;
            if(i%2==0)
            {
                ch = (char)('a'+i%26);
            }
            else
                ch=(char)('A'+i%26);
            
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " "); 
            }
            
            System.out.println("");
            
        }
sc.close();


    }
    
}
