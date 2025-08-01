import java.util.*;

public class StackInArrayList{
    

    public class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        // is_Empty
        public static boolean is_Empty(){
            return list.size() == 0;
        }

        // push
        public static void push(int data){
            list.add(data);
        }

        // pop
        public static int pop(){
            int top = list.get(list.size()-1);
            if(is_Empty()){
                return -1;
            }
            else{
                list.remove(list.size()-1);
                return top;
            } 
        }

        // peek
        public static int peek(){
            if(is_Empty()){
                return -1;
            }
            else{
                return list.get(list.size()-1);
            }
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