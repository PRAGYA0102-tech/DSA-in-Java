package methods;

public class Return {
    public static void main(String[] args) {
        int res= max(2,3);
        System.out.println(res);

    }
    public static int max(int a,int b){
        if(a>b) 
            return a;
        return b;          //else return statement is compulsory , if i am using IF in method .
    }
}
