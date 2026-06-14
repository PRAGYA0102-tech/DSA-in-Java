package Array;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = { 3, 5, 6, 8};
        int x = 11;
        int[] res = twoSum(nums, x);
        System.out.println("{" + res[0] + ", " + res[1] + "}");
        
        
    }
    

    public static  int[] twoSum(int[] nums, int target) {
        for( int i = 0 ; i < nums.length ; i++){
             for( int j = i + 1; j < nums.length ; j++){
                if (nums[i] + nums[j]== target)
                    return new int [] {i,j};
                }              
             }
        
         return new int [] {};
        
    }
 }

