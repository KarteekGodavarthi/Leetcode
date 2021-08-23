import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentNumbersAlternative {
    public static void main(String[] args) throws Exception {
        int[] num = {1,1,2,2,4,3,2,3,4,3,2,1,2,3,5,6,5,6,5,6,7};
        int[] result = topKFreq(num, 3);
        return;
    }

    public static int[] topKFreq(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int[] result = new int[k];
        for(int i = 0 ; i < nums.length; i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>((x , y) -> Integer.compare(hm.get(y), hm.get(x)));

        for(int i : hm.keySet()){
            queue.add(i);
        }

        while(k > 0){
            result[k-1] = queue.poll();
            k--;
        }
        return result;
    }
}
