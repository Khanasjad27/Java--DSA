/*cd "c:\Users\Admin\OneDrive\Desktop\Java--DSA"
javac Day23\ValidParantheses.java
java Day23.ValidParantheses
*/

package Day23;

import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String str){
        Stack <Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch =='(' || ch =='{' || ch =='[' ){ // Opening
                s.push(ch);
            }
            else{   // Closing
                if(s.isEmpty()){   // for condition like jisme saare closing bracket hai ")))))"
                    return false;
                }
                // pair condition
                if((s.peek() == '(' && ch == ')')   // 1
                    || (s.peek() == '{' && ch == '}') // 2
                    || (s.peek() == '[' && ch == ']') ) {  // 3 
                    s.pop();    // sussesfull pair form hua to usko pop karna hai   
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
                return true;
        }else{
            return false;
        }
   
    }
    public static void main(String[] args) {
        String str = "(({[]})"; // false
        System.out.println(isValid(str));
    }
}
