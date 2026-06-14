package Array;

public class LinearSearch  {
    public static void main(String[] args) {
        int [] arr = {3,6,5,8,9,2};
        int target = 9;
        boolean flag = false; //Assume target not in array  or  Approach 2- flag = -1
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) 
                {System.out.println("Target found at index " + i); //  Approach 2 : when flag != -1
                    flag = true; // Approach 2: no need
                    break;
                }
                       
        }
        if(!flag){ //   Approach 2 - when flag = -1
            System.out.println("TARGET IS IN ARRAY");
        }
        
    }
    
}
