package Day10;

import java.util.*;

public class BubbleSort {

    public static void sort(int nums[]) {

        // TC=  0(n^2) is worst case & Best Case
        // int n = nums.length;
        // for(int i = 0; i <= n - 2; i++) { // i for turns      i <= n - 2 or i<n-1
        //     for(int j = 0; j <= n - 2 - i; j++) {
        //         if(nums[j] > nums[j + 1]) {
        //             // swap
        //             int temp = nums[j];
        //             nums[j] = nums[j + 1];
        //             nums[j + 1] = temp;
        //         }
        //     }
        // }

        // Optimized
        // TC = 0(n) in Best Case & 0(n^2) is worst case
        int n = nums.length;
        for(int i = 0; i <= n - 2; i++) { // i for turns      i <= n - 2 or i<n-1
            boolean swap = false;
            for(int j = 0; j <= n - 2 - i; j++) {
                // is loop ke andar agar ek bhi swaping hogai for i = 0 iska matlab mere array ko sorting karna parega 
                if(nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
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
