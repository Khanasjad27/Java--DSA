import java.util.*;


public class PushAtBottam {
    public static void AtBottom(Stack <Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        AtBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        AtBottom(s, 4);
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }
}
