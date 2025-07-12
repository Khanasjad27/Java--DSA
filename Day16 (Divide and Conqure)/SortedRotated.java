// There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.

import java.util.*;

public class SortedRotated{
    public static int Elements(int nums[],int target,int si,int ei){
        if(si>=ei){
            return -1;
        }
    
        
        int mid = (si + ei)/2;
        if(target == nums[mid]){
                return mid;
        }else if(nums[si]<=nums[mid]){   // Array is sorted
            if((target>=nums[si]) && (target<=nums[mid]))
               return Elements(nums, target, si, mid);
            else
               return Elements(nums, target, mid+1, ei);
        }else{
            if((target>=nums[mid+1]) && (target<=nums[ei]))
               return Elements(nums, target, mid+1, ei);
            else
               return Elements(nums, target, si, mid-1);
        }
        
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(Elements(nums,target,0,nums.length-1));
    }
}