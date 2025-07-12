// package Day12 (Strings);
import java.util.*;
public class StringCompression {
    public static String Compression(String str){
        String newStr = ""; //yaha humne new String banaya hai for final
        for(int i=0;i<str.length();i++){
            Integer count = 1; // yaha integer likh hai coz baad me isko hamame string me convert karna hai new Sring me add karne keliya,  aur humne count = 1 kara hai coz hume pata hai ki ek character to hai
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {  // yaha humne < length -1 likha hai coz hum i and i+1 se compare karre hai; & ith position ko uske next position se compare karre hai therefore ya loop tabtak chalega jab tak dono equal hai
                count++;
                i++;
            }
            newStr+= str.charAt(i); // yaha hum phele char add karre hai
            if(count>1){
                newStr += count.toString();
            } 
        }
        return newStr;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = "aabbcccddddd";
        System.out.println(Compression(str));
    }
}
