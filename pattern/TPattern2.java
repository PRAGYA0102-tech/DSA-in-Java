package pattern;
import java.util.Scanner;

public class TPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r = sc.nextInt();
        //  for (int i = 1; i <= r; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print((char)(j+64)+ " ");
        //     }
        //     System.out.println("");
        // }
        int num=65;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)num+ " ");
            }
            num++;
            System.out.println("");
        }
sc.close();
    }
    
}
