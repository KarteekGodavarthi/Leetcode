

public class LongestIncreasingSubsequenceDP {
    public static void main(String[] args) throws Exception {
        int[] num = {1,2,3,4};
        lengthOfLIS(num);
    }

    public static int lengthOfLIS(int[] nums) {
        int[] values = new int[nums.length];
        values[0] = 1;
        int finalMax = 1;
        for(int i = 1;i < nums.length; i++){
            int j = i-1;
            int max = 0;
            while(j >= 0){
                if(nums[j] < nums[i] && max < values[j])
                    max = values[j];
                j--;
            }
            values[i] = max+1;
            if(values[i] > finalMax)
                finalMax = values[i];
        }
        return finalMax;
        
    }
}