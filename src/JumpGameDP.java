

public class JumpGameDP {
    public static void main(String[] args) throws Exception {
        int[] num = {1,2,3,4};
        canJump(num);
    }

    public static boolean canJump(int[] nums) {
        
        int reach = 0;
        
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == 0 && reach <=i)
                return false;
            else{
                if(nums[i] + i > reach)
                    reach = nums[i] + i;
            }
        }
        if(reach < nums.length-1)
            return false;
        else
            return true;
    }
}