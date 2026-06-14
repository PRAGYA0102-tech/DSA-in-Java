package pattern;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int rows = sc.nextInt();
        System.out.print("Enter col: ");
        int col = sc.nextInt();
        for (int i=0; i<rows;i++)
        {
            for (int j=0; j<col; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }

    
}
