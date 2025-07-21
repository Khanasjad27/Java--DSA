// package Day24 (Queue);

public class QueueInArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // isEmpty
        public static boolean isEmpty(){
            return rear == -1;
        }

        // Enqueue
        public static void Enqueue(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }

            rear = rear+1;
            arr[rear] = data;
        }

        // Dequeue
        public static int Dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = arr[0];   // yaha maine phele element front me store karadiya
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1]; //loop chalaya aur 0th position pe 1st position waala over write kiya and so no
            }
            rear = rear-1;  // rear agar 4th position pe tha ; to ab loop chane ke baad 4th position pe to kuch nhi hai therefore rear--

            return front;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Dequeue();

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Dequeue();
        }
    }
}
