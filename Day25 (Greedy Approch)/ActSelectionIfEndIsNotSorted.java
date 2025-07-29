import java.util.*;

public class ActSelectionIfEndIsNotSorted {
    public static void main(String[] args) {

        int start[] = {1,3,0,5,8,5};
        int end [] = {2,4,6,7,9,9};
        

        // Sorting
        int activities[][] = new int [start.length][3]; // yaha 2nd waale me 3 aaya coz 3 row banae hai
        for(int i=0;i<start.length;i++){
            activities[i][0] = i; // index store
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // Comparator.comparingDouble(o -> o[2]) is lamda fn  -> shortform for sorting
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));   // 2 ka matlab hai hame sorting column no. 2 ke hisab se karni hai
        
        // Now Answer
        int ActCount = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        ActCount = 1;  // 1st waala add karre hai isliya count++;
        ans.add(activities[0][0]);  // 1st waala hun apne answer me add karlrge
        int lastAct = activities[0][2];

        for(int i=1;i<end.length;i++){  // loop 1 se start kiya coz 0th index waala add kardiya phele ji
            if(activities[i][1]>=lastAct){
                ActCount++;   // phele count increase kardiya
                ans.add(activities[i][0]);    // phir jo condition satify hui hai usko add karege
                lastAct = activities[i][2];  // phil hum last index to change kardege
            }
        }

        System.out.println("Total Activity: "+ActCount);

        // printing answer
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }

}
