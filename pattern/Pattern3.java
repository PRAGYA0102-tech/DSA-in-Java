package pattern;
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the size of square: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
}
    }
    
}
