import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) throws Exception {
        int[] num = {1,2,3,4,5,67,8};
        //Time complexity is O(n*2), space is O(1)
        int[] result = sort(num, num.length-1);
        return;
    }

    public static int[] sort(int[] array, int index) {
        if(index == 0)
            return array;

        boolean swap = false;
        for(int i = 0; i < index; i++){
            if(array[i] > array[i+1]){
                int temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                swap = true;
            }
        }
        if(!swap)
            return array;
        else
            return sort(array, index - 1);
    }
}