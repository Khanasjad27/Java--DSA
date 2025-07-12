// package Day19 (Array List);
import java.util.*;
public class ContainerWIthMostRainwater {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        // brute force  -> 0(n^2)
        // for(int i=0;i<height.size();i++){
        //     for(int j=i+1;j<height.size();j++){
        //         int ht = Math.min(height.get(i), height.get(j));
        //         int wt = j-i;
        //         int currWaterLevel = ht * wt;
        //         maxWater = Math.max(maxWater, currWaterLevel);
        //     }
        // }

        // Optimize Approch -> 0(n)
        int lp = 0, rp = height.size()-1;
        while(lp<rp){
            // cal water area
            int ht = Math.min(height.get(rp),height.get(lp));
            int wt = rp - lp;
            int currWater = ht*wt;
            maxWater = Math.max(maxWater, currWater);

            // Update Pointer
            if(height.get(lp)<height.get(rp))
                lp++;
            else
                rp--;
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("The Area of the water is: "+storeWater(height));
    }
}
