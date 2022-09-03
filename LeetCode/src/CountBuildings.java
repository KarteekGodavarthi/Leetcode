import java.util.HashMap;
import java.util.Map;

public class CountBuildings {
    public static void main(String[] args) {
        int[] n = {5,6,8, 4, 10};
        int[] h = {1,2,1,2,2};
        System.out.println(countBuildings(n ,h ));
    }

    static int countBuildings(int[] A, int[] K){
        Map<Integer, Integer> map = new HashMap<>();
        int prevHeight = Integer.MIN_VALUE;
        int buildingCount = 0;
        for(int i = 0; i < A.length; i++){
            if(prevHeight > A[i]){
                if(map.containsKey(A[i]))
                    map.put(A[i], map.get(A[i])+1);
                map.put(A[i], 1);
            }
            else
            {
                if(K[i] > i)
                    buildingCount++;
                if(map.containsKey(A[i]))
                    map.put(A[i], map.get(A[i])+1);
                map.put(A[i], 1);
            }
        }
        return buildingCount;
    }
}
