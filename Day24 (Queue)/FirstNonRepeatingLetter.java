import java.util.*;

public class FirstNonRepeatingLetter{

    public static void printNonRepeating(String str){
        int freq[] = new int[26]; // 'a' to 'z'
        Queue <Character> q = new LinkedList<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++; // ya index pe jo bhi val hai usko increment kardo

            // jab tak q khali nhi hota ya freq ke specific index pe val >1 hai tab tak loop chalega
            while (!q.isEmpty() && freq[q.peek() - 'a']>1) {
                q.remove();
            }

            // agar q khali hai to -1 print kardo nhi to q.peek pe jo val hai usko print kardo
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" "); 
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}