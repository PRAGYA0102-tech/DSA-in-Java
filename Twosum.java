public class Twosum {
    
    public static int[] twosum(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
                }
        }
                    System.out.println("Target not available");
            
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;

        int[] res = twosum(num, target);

        System.out.println("{" + res[0] + ", " + res[1] + "}");
    }
}
    

   