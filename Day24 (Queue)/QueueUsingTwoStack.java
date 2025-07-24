// package Day24 (Queue);
import java.util.*;
public class QueueUsingTwoStack {

    static class Queue{
        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // add    0(n)
        public static void add(int data){
            while(!s1.isEmpty()){  // jab tak s1 khali nhi hota tabtak s2 me push karege jo pop hoga s1 se
                s2.push(s1.pop());
            }

            // ab khali hogaya s1
            s1.push(data);

            // ab s1 me data daal diya ab s2 se firse add karege on s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        // remove  0(1)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop();
        }
        // peek 0(1)
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(2);
        q.add(5);
        q.add(9);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
