// package Day12 (Strings);

import java.util.Scanner;


public class FirstLetterToUpperCase {
    public static String UpperCase(String str){
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){   // 2nd condition is for last me agar space aagai to usko count hone kekeliya
                sb.append(str.charAt(i));  // yaha malum pada ki space hai, us space to leliya uske baad uske baad wala(i.e i++) ko upper banake append karliya
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString(); // yaha stringBuilder ko string me convert kardiya
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Sentance: ");
        String str = scn.nextLine();
        System.out.println(UpperCase(str));
    }
}
