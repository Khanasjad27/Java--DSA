// There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.

import java.util.*;

public class SortedRotated{
    public static int Elements(int nums[],int target){

        // Binary Approch
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(target == nums[mid]){
                return mid;
            }else if(nums[start]<=nums[mid]){   // Array is sorted
                if((target>=nums[start]) && (target<=nums[mid]))
                    end = mid;
                else
                    start = mid + 1;
            }else{
                if((target>=nums[mid+1]) && (target<=nums[end]))
                    start = mid + 1;
                else
                    end = mid;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(Elements(nums,target));
    }
}