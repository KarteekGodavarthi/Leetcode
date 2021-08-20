import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) throws Exception {
        int[] num = {0,1,2,4,3,5,6,7,4,3,5,6,7,43,32,4,6};
        //Time complexity is O(n*2), space is O(1)
        int[] result = sort(num);
    }

    public static int[] sort(int[] array) {
        

        for(int i = 0 ; i < array.length; i++){
            int tempIndex = Integer.MAX_VALUE;
            int minValue = Integer.MAX_VALUE;

            for(int j = i ; j < array.length; j++){
                if(array[j] < minValue){
                    minValue = array[j];
                    tempIndex = j;
                }
            }
            if(minValue != array[i]){
                int temp = array[i];
                array[i] = array[tempIndex];
                array[tempIndex] = temp;
            }
        }
        return array;
    }
}