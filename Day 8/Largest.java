import java.util.*;

public class Largest {
    public static int LargestNumber(int nums[]) {
        int larg = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= larg){
                larg = nums[i] ;
            }
        }
        return larg;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {2,4,6,8,10,12,14,16};

        int large = LargestNumber(nums);
        System.out.print("The largest number in given array is: "+ large);
        
    }
}
