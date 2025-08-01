import java.util.*;

public class MaxLengthChain {
    public static void main(String[] args) {
        int pair[][] = {{5,24},{39,60},{5,28},{27,40},{50,40}};

        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int chainlenth = 1;  // phela add akrke hai isliya chain length 1 kardiya
        int chainEnd = pair[0][1];  // chain end kya hai

        for(int i=0;i<pair.length;i++){
            if(pair[i][0] > chainEnd){
                chainlenth++;
                chainEnd = pair[i][0]; // chainEnd update hua hai n jo condition satisfy hui thi usse hi update kardiya isse hame new chain end milgaya
            }
        }

        System.out.println("Max length of Chain: "+chainlenth);
    }
}
