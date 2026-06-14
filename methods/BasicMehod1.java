package methods;

public class BasicMehod1 {
    public static void main(String[] args) {
        add();
        sub();
        mul(4, 5); //Argument
    }
    public static void add(){
        System.out.println("ADD" + (3+4));
        sub();
        System.out.println("Addition done");
        
    }
     public static void sub(){
        System.out.println("Subtraction" + (3-1));
       
        System.out.println("SUB done");
        mul(2,4);
    }
     public static void mul(int a, int b){    //Parameters
        System.out.println("Mul:" + (a*b));
        
        System.out.println("Mul done");


    }
    
}
