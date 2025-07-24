// package Day24 (Queue);

import java.util.*;

public class StackUsingTwoQueue {
    static class Stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){ // yaha hum dono ko check karre hai coz hame nhi pata ki element konse q me hai
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            // jisme element hai usme add karna hai
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        public static int pop(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }

            int top = -1;
        }
    }
    public static void main(String[] args) {
        
    }
}
