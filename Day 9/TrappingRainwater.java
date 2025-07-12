import java.util.*;

public class TrappingRainwater{
    public static int Rainwater(int height[]){
        int n = height.length;
        // calculate left max boundary -> Auxillary Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);   // i-1 coz leftmax me 
        }
        // calculate Right max boundary -> Auxillary Array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){   // ya loop n-2 se start kiya hai coz n-1 ke value phele hi define kardiya hai
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater = 0;
        //loop
        for(int i=0;i<n;i++){
            // water level = min(left max, right max);
           int  waterlevel = Math.min(leftMax[i],rightMax[i]);
            // Trapped water = (waterlevel - height[i]) * width here width is "1"
           trappedWater += (waterlevel - height[i]) * 1;
        }
        return trappedWater;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int height[] = {4,2,0,6,3,2,5};
        System.out.print(Rainwater(height));
    }
}