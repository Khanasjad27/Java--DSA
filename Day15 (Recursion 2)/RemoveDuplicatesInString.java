

import java.util.*;



public class RemoveDuplicatesInString {
    public static void findDuplicate(String str, int idx,StringBuilder newString,boolean map[]){
        // Base Case
        if(idx == str.length()){ //jainse hi hum last char pe pouch jaaege waise is print karadege String ko
            System.out.println(newString);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);  // newChar naam ka new variable banae, index(idx ) jo given str ka usme wo index ka character save kiya
        if(map[currChar - 'a'] == true){ // Agar jo new array banae hai usme currchar - a true bata raha hai curreChar matlab duplicate hai
            // therefore is case me muje next index keliya call lagana hai
            findDuplicate(str, idx+1, newString, map);
        }else{ // iska matlab currChar pheli baar aara hai
            map[currChar - 'a'] = true; // yaha hum ne currChar ke index pe true kardiya, taki duplicate store na ho
            findDuplicate(str, idx+1, newString.append(currChar), map); // yaha hume jo new string banaya hai usme currChar daal diya
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = scn.nextLine();
        findDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
