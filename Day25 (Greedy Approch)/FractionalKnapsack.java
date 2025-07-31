import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 2 coz =>  0th column pe idx n 1st column pe ratio
        for(int i=0;i<ratio.length;i++){
            ratio[i][0] = i;  // index store
            ratio[i][1] = val[i]/ (double)weight[i];  // kishi ek ko type cast kiya coz warna val int me aagaegi
        }

        // Sorting = > Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // ratio ke index 1 ke basis pe sort karre hai 
        int Capacity = W;
        int finalval = 0;
        for(int i=ratio.length-1;i>=0;i--){
            // since 2d array hai & humne 0th index pe index store kiya tha 
            int idx = (int)ratio[i][0];
            if(Capacity>=weight[idx]){
                // Total include
                Capacity -= weight[idx];
                finalval += val[idx];
            }else{
                // fractional item include
                finalval += (ratio[i][1]*Capacity);
                Capacity = 0;
                break;
            }
        }

        System.out.println("Final val: "+finalval);
    }
}
