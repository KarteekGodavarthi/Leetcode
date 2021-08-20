import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        int[] num = {6,5,4,3,2,1};
        //Time complexity is O(n*2), space is O(1)
        int[] result = sort(num);
    }

    public static int[] sort(int[] array) {
        
        for(int i = 0; i < array.length; i++){
            boolean swapped = false;
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j+1]){
                    swapped = true;
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            if(!swapped)
                break;
        }

        return array;
    }
}