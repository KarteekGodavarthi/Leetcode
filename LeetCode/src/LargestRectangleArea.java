import java.util.Arrays;

public class LargestRectangleArea {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,4,6,8,7};
        int[] arr2 = {1,5,6,7};
        System.out.println(largest_rectangle( 3,  3, arr1, arr2));
    }

    static int largest_rectangle(int n, int m, int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int smallNumber = Integer.MIN_VALUE;
        int largeNumber = Integer.MAX_VALUE;

        int smallPointer1 = 0;
        int smallPointer2 = 0;

        while(smallPointer1 <= a.length-1 && smallPointer2 <= b.length-1){
            if(a[smallPointer1] == b[smallPointer2])
            {
                smallNumber = a[smallPointer1];
                break;
            }
            else if(a[smallPointer1] < b[smallPointer2])
                smallPointer1++;
            else smallPointer2++;
        }

        int largePointer1 = a.length-1;
        int largePointer2 = b.length-1;

        while(largePointer1 >= 0 && largePointer2 >= 0){
            if(a[largePointer1] == b[largePointer2]){
                largeNumber = a[largePointer1];
                break;
            }
            else if (a[largePointer1] > b[largePointer2]) {
                largePointer1--;
            }
            else largePointer2--;
        }

        if(largeNumber != Integer.MAX_VALUE && smallNumber != Integer.MIN_VALUE && largeNumber != smallNumber)
            return largeNumber-smallNumber;
        return 0;
    }

}
