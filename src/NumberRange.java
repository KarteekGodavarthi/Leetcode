import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;


public class NumberRange {
    public static void main(String[] args) throws Exception {
        int[] num = {5,7,7,8,8,10};
        searchRange(num, 6);
        return;
    }
    static int[] result;
    public static int[] searchRange(int[] nums, int target) {
        result = new int[2];
        Arrays.fill(result, -1);
        search(nums, target, 0, nums.length-1);
        return result;
    }

    public static void search(int[] nums, int target, int start, int end){
        if(start > end){
            return;
        }
        
        int mid = (start + end)/2;
        if(nums[mid] <= target){
            search(nums, target, mid+1, end);
        }
        if(nums[mid] >= target)
            search( nums, target, start, mid-1);
        
        if(nums[mid] == target){
            if(result[0] == -1 && result[1] == -1){
                result[0] = mid;
                result[1] = mid;
            }
            else if(mid < result[0])
                result[0] = mid;
            else if(mid > result[1])
                result[1] = mid;
        }
        return;
    }
}
