import java.util.*;

public class ActivitySelection{
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};
        
        // Now Answer
        int ActCount = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        ActCount = 1;  // 1st waala add karre hai isliya count++;
        ans.add(0);  // 1st waala hun apne answer me add karlrge
        int lastAct = end[0];

        for(int i=1;i<end.length;i++){  // loop 1 se start kiya coz 0th index waala add kardiya phele ji
            if(start[i]>=lastAct){
                ActCount++;   // phele count increase kardiya
                ans.add(i);    // phir jo condition satify hui hai usko add karege
                lastAct = end[i];  // phil hum last index to change kardege
            }
        }

        System.out.println("Total Activity: "+ActCount);

        // printing answer
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}