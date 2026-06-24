package MultiDimensionArray;

public class foreach {
    public static void main(String[] args) {
        int [][] a = { {1,2,3},{ 10,11,5},{ 6,9,0}};
     for(int [] e : a){ 
        for(int elem : e){
                System.out.print(elem + " ");

        }
       // System.out.println("");
     }
        
    }
     

    
}
