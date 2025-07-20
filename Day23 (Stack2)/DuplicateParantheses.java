// package Day23;   => iske waje se error aara hai koi farak nhi parta usse

import java.util.Stack;

public class DuplicateParantheses {
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // Closing
            if(ch == ')'){
                int count = 0;
                while (s.peek()!='(') {
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true; // Duplicates Exists
                }else{
                    s.pop(); // Opening pair ko pop 
                }
            }else{   // Opening, Operatar, Operant
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "((a+b)=(a+b))"; // false
        String str2 = "((a+b))";     // true
        System.out.println(isDuplicate( str2));
    }
}
