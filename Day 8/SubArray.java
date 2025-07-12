import java.util.*;

public class SubArray {
    public static void SubArray(int nums[]) {
        int ts = 0;
        for(int i = 0;i<nums.length;i++){
            int first = i;
            for(int k=i;k<nums.length;k++){
                int last = k;
                for(int j=first;j<=last;j++){
                    System.out.print(nums[j]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total subarray: "+ ts);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {2,4,6,8,10,12,14,16};
        SubArray(nums);
        
    }
}
