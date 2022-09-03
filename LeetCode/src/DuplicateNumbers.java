import java.util.*;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if(set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
