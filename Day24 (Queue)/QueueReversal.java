import java.util.*;;

public class QueueReversal {

    public static void reversal(Queue <Integer> q){
        Stack <Integer> s = new Stack<>();
        // adding elements in stack
        while (!q.isEmpty()) {
            // q ke front se element nikal te jaaege n stack me push hote jaaega isse hume aise milega 1 2 3 4 5 therefore jab hum firse q me push kagege tab 5 4 3 2 1 jaaega 
            s.push(q.remove()); 
        }
        // again adding elemnt in queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        reversal(q);
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
