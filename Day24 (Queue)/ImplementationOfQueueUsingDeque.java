import java.util.*;

public class ImplementationOfQueueUsingDeque {
    static class Queue{
        Deque<Integer> dq = new LinkedList<>();

        // add
        public void add(int data){
            dq.addLast(data);
        }
        // remove
        public int remove(){
            return dq.removeFirst();
        }
        // peek
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek = "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
