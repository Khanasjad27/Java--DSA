package Day10;

import java.util.Scanner;

public class InsertionSort {
    public static void sort(int nums[]) {
        int n = nums.length;
        for(int i = 1; i <= n - 1; i++) { 
            int curr = nums[i];
            int prev = (i - 1);
            // finding correct position to insert
            while(prev >=0 && nums[prev] >= curr){
                nums[prev+1] = nums[prev];
                prev--;
            } 
            nums[prev+1] = curr;
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
