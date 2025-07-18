public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    // addfirst
    public void addFirrst(int data){
        //S1
        Node newNode = new Node(data);
        size++;
        // Base Condition
        if(head== null){
            head = tail= newNode;
            return;
        }
        //S2
        newNode.next = head;
        //S3
        head.prev = newNode;
        //S4
        head = newNode;
    }

    // Addlast
    public void addLast(int data){
        //S1
        Node newNode = new Node(data);
        size++;
        // Base Condition
        if(head== null){
            head = tail= newNode;
            return;
        }
        // S2
        tail.next = newNode;
        // S3
        newNode.prev = tail;
        //S4
        tail = newNode;
    }

    // Remove first
    public int removefirst(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){ // jab single element hai
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        size--;
        int val = head.data;
        head = head.next;
        head.prev = null;

        return val;
    }

    //Remove last
    public int removelast(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }

        if(size==1){ // jab single element hai
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        size--;
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;

        return val;
    }

    // Print
    public void print(){
        if(head == null){
            System.out.println("Linkedlist is Empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // Q1 Reverse LL
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next ;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirrst(5);
        dll.addLast(8);
        dll.addLast(2);
        dll.addFirrst(9);
        dll.print();
        // dll.removefirst();
        // dll.removelast();
        // dll.print();
        // System.out.println(size);
        dll.reverse();
        dll.print();

    }

}
