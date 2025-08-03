

import java.util.*;
import java.util.LinkedList;



public class MergeSort {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;


    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;   // slow = mid        
    }

    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null || head2 != null){
            if(head1.data > head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }


        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2!=null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }
    public Node Msort(Node head){  // Recursive fn hai isliya head parameter liya 
        if(head==null && head.next==null){
            return head;
        }
        // Find mid
        Node mid = getMid(head);

        // left node & right node
        Node rightNode = mid.next;
        mid.next = null;

        Node newLeft = Msort(head);
        Node newRight = Msort(rightNode);

        // merge
        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println(ll);

        Msort(ll.hea);
        System.out.println(ll);
    }
    
}
