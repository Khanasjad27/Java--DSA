import java.util.*;

public class MaxSumOfSubArray {
    public static void MaxSum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            int first = i;
            for(int k=i;k<nums.length;k++){
                int last = k;
                int sum = 0;
                for(int j=first;j<=last;j++){
                    sum = sum + nums[j];
                }
                System.out.print(sum+" ");
                if(maxSum<=sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("          "+"Max sum from sub arrays is: " +maxSum);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {2,4,6,8,10};
        MaxSum(nums);
    }
}
