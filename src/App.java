import java.util.*;

 class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

public class App {
    public static void main(String[] args) throws Exception {
        int[] m = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(m);
    }

    
    public static int maxSubArray(int[] nums) {
        
        int[][] result = new int[nums.length][nums.length];
        
        int max = 0;
        
        result[0][0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            result[0][i] = result[0][i-1] + nums[i];
            if(result[0][i] > max)
                max = result[0][i];
        }
        
        for(int i = 1; i < result[0].length; i++){
            for(int j = i; j < result[0].length; j++){
                result[i][j] = result[i-1][j] - nums[i-1];
                if(result[i][j] > max)
                    max = result[i][j];
            }
        }
        
        return max;
    }

}


