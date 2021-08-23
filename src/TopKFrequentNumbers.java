import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentNumbers {
    public static void main(String[] args) throws Exception {
        int[] num = {1};
        int[] result = topKFreq(num, 1);
        return;
    }

    public static int[] topKFreq(int[] num, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] result = new int[k];
        
        for(int i = 0; i < num.length; i++){
            queue.add(num[i]);
        }

        PriorityQueue<pair> queue2 = new PriorityQueue<>(num.length, new CustomerCompare());


        int prev = queue.poll();
        int count = 1;
        while(queue.size() >= 0){
            if(queue.size() == 0){
                queue2.add(new pair(prev, count));
                break;
            }
            int temp = queue.poll();
            if(temp != prev)
            {
                queue2.add(new pair(prev, count));
                prev = temp;
                count = 1;
            }
            else
                count++;
        }
        int l = 0;
        while(k > 0){
            result[l] = queue2.poll().key;
            k--;
            l++;
        }

        return result;
    }
}

class CustomerCompare implements Comparator<pair>{
              
    public int compare(pair s1, pair s2) {
        if (s1.value < s2.value)
            return 1;
        else if (s1.value > s2.value)
            return -1;
                        return 0;
        }
}
class pair {
    int key,value;
    
    // Constructor
    public pair(int key,int value)
    {
        this.key = key;
        this.value = value;
    }
    public String toString()
    {
        return this.key + " " + this.value;
    }
}