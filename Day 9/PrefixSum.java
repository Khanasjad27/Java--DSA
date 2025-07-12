import java.util.*;

public class PrefixSum {
    public static void MaxSum(int nums[]) {
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];   // 1st digit same rahega
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }

        for(int i = 0;i<nums.length;i++){
            int first = i;

            for(int k=i;k<nums.length;k++){
                int last = k;
                int sum = 0;
                // agar start ki value zero hui to then sum = prifix of last i.e prefix[last]
                sum = first == 0 ? prefix[last] : prefix[last] - prefix[first - 1];   
                if(maxSum<=sum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max sum from sub arrays is: " +maxSum);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {2,4,6,8,10};
        MaxSum(nums);
    }
}
