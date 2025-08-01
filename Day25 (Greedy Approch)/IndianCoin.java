import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int value = 590;

        Arrays.sort(coins, Comparator.reverseOrder());

        int ans = 0;
        ArrayList<Integer> notes = new ArrayList<>();
    
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=value){
                while (coins[i]<=value) {
                    ans++;
                    value-=coins[i];
                    notes.add(coins[i]);
                }
            }
        }

        System.out.println("Total (min) coin used: "+ans);
        System.out.print("Coins are: ");
        for(int i=0;i<notes.size();i++){
            System.out.print(notes.get(i)+" ");
        }
    }
}
