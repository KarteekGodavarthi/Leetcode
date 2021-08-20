import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args) throws Exception {
        int[] num = {1,6,2,8,1,9,3,5,9,4,6,0,2,4};
        //Time complexity is O(n*2), space is O(1)
        int[] result = sort(num, num.length - 1);
        return;
    }

    private static int[] sort(int[] num, int index) {
        if(index == 0)
        return num;

        sort(num, index - 1);

        int key = num[index];

        int j = index - 1;

        while(j >= 0 && num[j] > key){
            num[j+1] = num[j];
            j--;
        }

        num[j+1] = key;

        return num;
    }

    

}