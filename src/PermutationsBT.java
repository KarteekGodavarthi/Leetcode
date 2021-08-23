import java.util.ArrayList;
import java.util.List;

public class PermutationsBT {
    public static void main(String[] args) throws Exception {
        int[] num = {1,2,3,4};
        var temp = Permutations(num);
        return;
    }

    private static List<List<Integer>> Permutations(int[] num) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        resultList.add(new ArrayList<Integer>());
        return getPermutations(num, resultList, 1);
    }

    private static List<List<Integer>> getPermutations(int[] num, List<List<Integer>> resultList, int subsetLevel) {
        if(subsetLevel > num.length)
        return resultList;
        List<List<Integer>> tempList = new ArrayList<List<Integer>>();

        for(int j = 0; j < resultList.size(); j++){
            List<Integer> list = resultList.get(j);
            if(list.size() == subsetLevel - 1){
                for(int i = 0; i < num.length; i++){
                    if(!list.contains(num[i])){
                        List<Integer> newSubset = new ArrayList<>(list);
                        newSubset.add(num[i]);
                        tempList.add(newSubset);
                    }
                }
            }
        }
        
        resultList = getPermutations(num, tempList, subsetLevel + 1);
        return resultList;
    }
}
