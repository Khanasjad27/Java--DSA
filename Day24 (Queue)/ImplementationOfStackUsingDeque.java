import java.util.*;

public class ImplementationOfStackUsingDeque {
    static class Stack{

        Deque <Integer> dq = new LinkedList<>();

        // push
        public void push(int data){
            dq.addLast(data);
        }
        // pop
        public int pop(){
            return dq.removeLast();
        }
        //peek
        public int peek(){
            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(9);
        s.push(91);
        System.out.println("peek = "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
