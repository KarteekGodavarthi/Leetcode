import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;


public class KthlargestNumber {
    public static void main(String[] args) throws Exception {
        int[] num = {5,7,7,8,8,10};
        findLargest(num, 6);
        return;
    }

    public static int findLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((x, y) -> Integer.compare(y,x));
        
        for(int num : nums){
            queue.add(num);
        }
        
        while(k > 0){
            int temp = queue.poll();
            k--;
            if(k == 0)
                return temp;
        }
        return -1;
    }

  
}
