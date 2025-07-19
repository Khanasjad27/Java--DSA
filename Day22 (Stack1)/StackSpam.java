import java.util.*;


public class StackSpam {
    public static void StackSpan(int stock[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1;i<stock.length;i++){
            int currPrice = stock[i];
            while(!s.isEmpty() && currPrice >stock[s.peek()] ){ // ya loop tab tak chalega jabtab hamara stack khali na hojae and currpicre bara ho phele waale se
                s.pop(); // jab tak greater elemnts milta nhi hai tabtak saare to nikal do
            }
            // Ab saare chote elements nikal gai hai
            if(s.isEmpty()){ // agar khali hogaya matlab humko max milgaya hai, matlab khud ko bhi lega aur usse chote waalwko bhi
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];
        StackSpan(stock, span);
        for(int i=1;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
