import java.util.*;

public class StackInLL {
    

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public class stack{
        static Node head = null;
    
        // is_Empty
        public static boolean is_Empty(){
            return head == null;
        }

        // push
        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop
        public static int pop(){
            if(is_Empty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek(){
            if(is_Empty()){
                return -1;
            }
            return head.data;

        }
        
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

