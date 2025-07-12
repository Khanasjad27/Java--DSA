package Day10;

import java.util.*;

public class SelectionSort {
    public static void sort(int nums[]) {
        int n = nums.length;
        for(int i = 0; i <= n - 2; i++) { // i for turns   i <= n - 2 or i<n-1
            int small = i;
            for(int j=i+1;j<n;j++){
                if(nums[small]>nums[j])
                    small = j;
            }
            // swap
            int temp = nums[small];
            nums[small] = nums[i];
            nums[i] = temp;
        }
        printArr(nums);
    }

    public static void printArr(int nums[]) {
        int n = nums.length;
        System.out.print("{");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] +",");
        }
        System.out.print("}");
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {5, 4, 1, 2, 3};
        sort(nums);
    }
}
