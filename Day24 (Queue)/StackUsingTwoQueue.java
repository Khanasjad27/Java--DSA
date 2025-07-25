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

            // case1=> jisme q1 me saare elements hai
            if (!q1.isEmpty()) { // check karre hai ki q1 me elemnt hai ya q2 me
                while (!q1.isEmpty()) {  // jab tak q1 empty nhi hota tabtak q1 se elemnt ko nikalege
                    top = q1.remove();  // yaha pe loop end hote hote humko last element miljaaega
                    if(q1.isEmpty()){ // jaise hi q1 empty hojaaega waise hi break kardege last me top return kardege coz top me last element ke val store hai
                        break;
                    }
                    q2.add(top); // agar last elemt nhi hai to q2 me hum add karte jaaege
                }
            }else{ // case2 => isme q2 me saare elemnts hai
                // same as above but wrt q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }

            int top = -1;

            // case1=> jisme q1 me saare elements hai
            if (!q1.isEmpty()) { // check karre hai ki q1 me elemnt hai ya q2 me
                while (!q1.isEmpty()) {  // jab tak q1 empty nhi hota tabtak q1 se elemnt ko nikalege
                    top = q1.remove();  // yaha pe loop end hote hote humko last element miljaaega
                    q2.add(top); // agar last elemt nhi hai to q2 me hum add karte jaaege
                }
            }else{ // case2 => isme q2 me saare elemnts hai
                // same as above but wrt q2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }

            return top;
        }
    }
    public static void main(String[] args) {
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
