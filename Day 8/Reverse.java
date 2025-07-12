import java.util.*;

public class Reverse {
    public static void Reverse(int nums[]) {
        int first = 0 , last = nums.length-1;
        while(first<last){
            // swap
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {2,4,6,8,10,12,14,16};
        Reverse(nums);
        for(int i=0;i<=nums.length-1;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
