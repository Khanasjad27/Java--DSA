// Find if any pair in a sorted ArrayList has a target sum

// package Day19 (Array List);
import java.util.*;
public class PairSum1 {

    // // Brute Force -> 0(n^2)
    // isko boolean leke bhi kar sakta hu usme yaha pe print nhi karna hoga sirf true/false return karna hoga
    // public static void sum(ArrayList<Integer> list, int target){   
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if((list.get(i)+list.get(j))== target){
    //                 System.out.print("("+list.get(i)+","+list.get(j)+")");
    //             }
    //         }
    //     }
    // }

    // Optimize Approch(Two Pointer Approch)  -> 0(n)
    public static boolean sum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            // case 1
            if((list.get(lp)+list.get(rp)) == target)
                return true;
            else if((list.get(lp)+list.get(rp))<target)
                lp++;
            else if((list.get(lp)+list.get(rp))>target)
                rp--;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(sum(list, target));
    }
}
