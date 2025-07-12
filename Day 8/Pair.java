import java.util.*;

public class Pair {
    public static void printPair(int nums[]) {
        int tp = 0; // total pair
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+curr+","+nums[j]+") " );
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total numbers of pair is "+tp);
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {2,4,6,8,10,12,14,16};
        printPair(nums);
    }
}
