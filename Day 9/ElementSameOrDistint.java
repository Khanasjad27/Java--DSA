// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

import java.util.*;

public class ElementSameOrDistint{
    public static boolean Elements(int nums[]){

        // Approch 1 => not optimal T.S = O(n^2)
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length-1; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;

        // Approch 2 => Use Js hast; not know while doing this question
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int nums[] = {1,2,3,4};
        System.out.print(Elements(nums));
    }
}