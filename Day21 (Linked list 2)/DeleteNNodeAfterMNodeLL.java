public class DeleteNNodeAfterMNodeLL {

    // Node class .
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add node at the beginning 
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Remove first node and return its value
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;

        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }

        size--;
        return val;
    }

    // Print linked list
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Delete N nodes after M nodes
    public void deleteNAfterM(int M, int N) {
        Node curr = head;

        while (curr != null) {
            // Step 1: Skip M nodes
            for (int i = 1; i < M && curr != null; i++) {
                curr = curr.next;
            }

            // If curr is null or end reached, break
            if (curr == null || curr.next == null) {
                break;
            }

            // Step 2: Delete N nodes
            Node temp = curr.next;
            for (int j = 0; j < N && temp != null; j++) {
                temp = temp.next;
                size--; // optional
            }

            // Step 3: Link current node to temp
            curr.next = temp;

            // Step 4: Move curr forward
            curr = temp;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        DeleteNNodeAfterMNodeLL ll = new DeleteNNodeAfterMNodeLL();
        int M = 3, N = 2;

        ll.addFirst(25);
        ll.addFirst(4);
        ll.addFirst(6);
        ll.addFirst(9);
        ll.addFirst(15);
        ll.addFirst(12);
        ll.addFirst(5);
        ll.addFirst(25);
        ll.addFirst(51);

        System.out.println("Original Linked List:");
        ll.print();

        ll.deleteNAfterM(M, N);

        System.out.println("After deleting " + N + " nodes after every " + M + " nodes:");
        ll.print();
    }
}
