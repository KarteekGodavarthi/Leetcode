


public class FindPeakElement {
    public static void main(String[] args) throws Exception {
        int[] num = {1,2,3,1,6,7,2,1,2,3,4,5,6,4,56,7,5,3,45,1};
        int temp = findPeak(num);
        return;
    }
    private static int findPeak(int[] num) {
        return peak(num, 0, num.length-1);
    }

     private static int peak(int[] num, int start, int end) {
        if(num.length == 1)
            return 0;
        if(start > end)
            return -1;
        
        int mid = (start + end)/2;
        if(mid == 0){
            if(num[mid] > num[mid+1])
                return mid;
        }
        else if(mid == num.length - 1){
            if(num[mid] > num[mid-1])
            return mid;
        }
        else{
            if(num[mid] > num[mid+1] && num[mid] > num[mid-1])
                return mid;
        }

        int left = peak(num, start, mid - 1);
        if(left != -1){
            return left;
        } 
        int right = peak(num, mid+1, end);
        if(right != -1){
            return right;
        } 
        return -1;
    }
    
}
