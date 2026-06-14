package methods;

public class BuiltMath {
    public static void main(String[] args) {
        double x = Math.sqrt(5.0 );
        double y = Math.cbrt(6.0);
        System.out.println(x);
        System.out.println(y);
        System.out.println(Math.abs(-9)); //9
        System.out.println(Math.floor(6.9)); //6
        System.out.println(Math.floor(-6.9)); //-7
        System.out.println(Math.pow(8.9, 9.0));
        System.out.println(Math.pow(-8.9,-5)); //For negative number power must be integer(+,-)
        System.out.println(Math.max(Math.max(4,5),Math.max(9.8,7.0)));
        System.out.println(Math.min(Math.min(4,5),Math.min(9.8,7.0)));
        System.out.println(Math.min(Math.max(4,5),Math.min(9.8,7.0)));
        
        
    }
    
}
