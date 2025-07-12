// package Day19 (Array List);
import java.util.*;
public class MaxInAL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(96);
        list.add(6666);

        // max
        int maxNum = Integer.MIN_VALUE; 
        for(int i=0;i<list.size();i++){
            if(maxNum<list.get(i))
                maxNum = list.get(i);
        }
        System.out.println(maxNum);
    }
}
