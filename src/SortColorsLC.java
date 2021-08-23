import java.util.Arrays;

public class SortColorsLC {
    public static void main(String[] args) throws Exception {
        int[] num = {2,0,2,1,1,0};
        int[] result = sort(num);
    }

    public static int[] sort(int[] nums) {
        int p0 = -1;
        int p1 = -1;
        int c = 0;
        for(int i =0 ;i<nums.length;i++){
            c = nums[i];
            nums[i] =2;
            if(c <= 1) nums[++p1]=1;
            if(c == 0) nums[++p0]=0;
        }
        return nums;
    }
}