
public class Basics {

    //Way of execution of operator depends on type of operand.

    public static void main(String[] args) {
        int x= 3/2;
        double y=3.0/2;
        System.out.println(x); //1
        System.err.println(y); //1.5

        //ASCII value : 0-48, A-66 , a-97
        char ch1 = '3';
        System.out.println((int)ch1); //51
        char ch2 ='b';
        System.out.println(ch2*ch2); //9604
         int z=43;
         char c= (char)z;
         System.out.println(c); //+

         //Post and pre increment-
         int a=10;
         int b= a++;
         System.out.println(a + " " + b); // 11  10

        //  char ch3 ='b';
        // System.out.println(++ch3); //c

         char ch3 ='b';
        System.out.println(ch3+1); //99



    }
    
}
