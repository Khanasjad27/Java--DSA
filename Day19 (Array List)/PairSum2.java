// package Day19 (Array List);

// Find if any pair in a Sorted & Rotated ArrayList has a Target sum 

import java.util.*;
public class PairSum2 {

    public static boolean sum(ArrayList<Integer> list, int target){
        int bp = -1; // Breaking pt/ Pivot
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp = i;
                break;
            }
    
        }
        int lp = bp+1;
        int rp = bp;
        while(lp!=rp){  // ya circular loop hoga therefore ya condition
            // case 1
            if((list.get(lp)+list.get(rp)) == target)
                return true;
            else if((list.get(lp)+list.get(rp))<target)
                // lp = (lp+1)%n
                lp = (lp+1)%list.size();
            else if((list.get(lp)+list.get(rp))>target)
                // rp = (n+rp-1)%n
                rp = (list.size()+rp-1)%list.size();
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(sum(list, target));
    }
}
