import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) throws Exception {
        int[] num = {1,6,2,8,1,9,3,5,9,4,6,0,2,4};
        //Time complexity is O(n*2), space is O(1)
        int[] result = sort(num);
        return;
    }

    public static int[] sort(int[] array) {

        for(int i = 0; i< array.length; i++){
            int j = i;
            while(j > 0){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    j--;
                }
                else
                    break;
            }
        }

        return array;
    }
}