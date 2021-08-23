import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) throws Exception {
        int[] num = {1,6,2,5,8,2,5,7,3,9};
        //Time complexity is O(nlogn), space is O(1)
        int[] result = sort(num, 0,num.length-1);
        return;
    }

    private static int[] sort(int[] num, int start, int end) {
        if(start >= end)
            return num;

        int mid = (start + end)/2;

        sort(num, start, mid);
        sort(num, mid+1, end);

        merge(num,start, mid, end);
        return num;
    }

    private static void merge(int[] num, int start, int mid, int end) {
        
        int[] array1 = new int[mid - start + 1];
        int[] array2 = new int[end - mid];

        for(int i = 0; i < array1.length; i++){
            array1[i] = num[start+i];
        }
        for(int i = 0; i < array2.length; i++){
            array2[i] = num[mid+1+i];
        }

        int pointer1 = 0, pointer2 = 0, pointer3 = start;

        while(pointer1 < array1.length && pointer2 < array2.length){
            if(array1[pointer1] < array2[pointer2]){
                num[pointer3]  = array1[pointer1];
                pointer1++;
                pointer3++;
            }
            else{
                num[pointer3] = array2[pointer2];
                pointer2++;
                pointer3++;
            }
        }
        if(pointer1 == array1.length){
            while(pointer2 < array2.length){
                num[pointer3] = array2[pointer2];
                pointer3++;
                pointer2++;
            }
        }
        else{
            while(pointer1 < array1.length){
                num[pointer3] = array1[pointer1];
                pointer3++;
                pointer1++;
            }
        }

    }

    

}