import java.util.*;

public class InterLeave2Half {

    public static void interleave(Queue<Integer> q){
        int size = q.size();
        Queue <Integer> first = new LinkedList<>();
        // yaha par humne size/2 tak loop chalaya hai n original se nikal ke first me baale hai
        for(int i=0;i<size/2;i++){
            first.add(q.remove());
        }

        // hab interleave hoga
        while (!first.isEmpty()) {
            q.add(first.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave(q);
        // printing
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
