import java.util.*;

public class BinarySearch {
    public static int BinarySearch(int nums[], int key) {
        int start = 0 , end = nums.length-1;
        while(start<=end){
            int mid = (start + end)/2;

            // comparison
            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid]<key){ // here we will serch in 2nd half
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int find = BinarySearch(nums,key);
        System.out.print("index for key is : "+ find);
    }
}
