// package Day24 (Queue);

public class CircularQueueInArray {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty
        public static boolean isEmpty(){
            return rear == -1 || front == -1;
        }

        //isFull
        public static boolean isFull(){  // hum rear ko aage barana caharahe hai lakin wo index pe front hai therefore full
            return (rear+1) % size == front;
        }

        // Enqueue
        public static void Enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){ // for 1st element
                front = 0;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }

        // Dequeue
        public static int Dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];   // yaha maine phele element front me store karadiya
            // last ele delete 
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        
        System.out.println(q.Dequeue());
        q.Enqueue(4);

        System.out.println(q.Dequeue());
        q.Enqueue(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Dequeue();
        }
    }
}
