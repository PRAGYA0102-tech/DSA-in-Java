package methods;

public class PassByValue {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x); //5
        change(x);
        System.out.println(x); //5
    }
    public  static void change(int x){
        x=10;
        System.out.println(x); //10
    }
    
}
