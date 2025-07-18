// package Day19 (Array List);
import java.util.*;
public class Swap {
    public static void swapFn(ArrayList<Integer> list, int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int idx1 = 1, idx2 = 3;

        System.out.println("Before Swap");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.err.println();
        swapFn(list, idx1, idx2);
        System.out.println("After Swap");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
