
// All Question does not use Java collection frame work

// package Day20 (Linked list);


public class CreationOfLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // S1 => Creation OfnewNode
        Node newNode = new Node(data);
        size++;
        // Base Case
        if(head == null){
            head = tail = newNode;
            return;
        }

        // S2 => newNode.next = head
        newNode.next = head;

        // S3 => head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // Creation
        Node newNode = new Node(data);
        size++;
        // Base case
        if(head == null){
            head = tail = newNode;
        }
        // S2
        tail.next = newNode;
        // S3
        tail = newNode;
    }

    public void addAtMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        // Creating new Node
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i=0;
        // yaha se temp, prev pe bait jaaega
        while(i<idx-1){  // finding prev
            temp = temp.next;
            i++;
        }
        
        newNode.next=temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){ // Yaha int type liya coz jo val remove hogi usko hum return karege
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size==1){   // Matlab mere head bhi same hai & tail bhi
            int val = head.data;
            size=0;   // coz size 1 thi & 1 element remove hogaya
            head=tail=null;
        }
        int val = head.data; // Ya val ko remove karna hai 

        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
         if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size==1){   // Matlab mere head bhi same hai & tail bhi
            int val = head.data;
            size=0;   // coz size 1 thi & 1 element remove hogaya
            head=tail=null;
        }
        // prev = i = size -2;
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }  // ya loop se ham prev waale position pe pouch gai
        int val = tail.data;  
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }






    //Q1 Search Key in ll & return idx using iterativeSearch
    public  int iterativeSearch(int key){
        int idx = 0;
        Node temp = head;
        while (temp!=null) {
            if(temp.data==key){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }  

    //Q2 Search Key in ll & return idx using recursiveSearch
    public int helper(Node head, int key){
        // Base Case
        if(head==null)
            return -1;
        
        // kaam
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
    }
    public int RecursiveSearch(int key){
        return helper(head, key);
    }


    // Q3 Reverse a LL
    public void reverse(){
        Node prev = null; // coz head ke phele waali node null hoti hai
        Node curr = tail= head;// head ki val tail & curr me copy hogai
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Q4 Remove Nth node from End
    public void deleteNthFromEnd(int N){
        // Cal size
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(N==sz){ // kya hame apne head ko delete karna hai
            head = head.next; //  Remove condition
            return;
        }
        int i = 1;
        int iToFind = sz - N;
        Node prev = head;
        while (i<iToFind) {
            prev = prev.next;
            i++;
        }
        
        prev.next = prev.next.next;   // prev.next.next => prev ka next ka next
        return;
    }


    // Q5 Palandrom
    public Node findMid(Node head){  // helper function
        Node fast = head;
        Node slow = head;

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //  slow is mid
    }

    public boolean checkPalendrom(){
        // base case
        if(head==null || head.next==null){
            return true;  // ya condition hai jab head ya to khali hoga ya to usme 1 element hoge
        }

        // S1: find mid
        Node mid = findMid(head);
        // S2 : reverse half ll
        Node curr = mid;
        Node prev = null;
        Node next ;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // S3 : Compare 1st half & 2nd half
        // right half head
        Node right = prev; // coz upar waala loop chalne ke baad prev ab end pe pouch gaya hai
        // left half head
        Node left = head;

        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }



    // 2nd lecture
    // Q1 Detect cycle in ll
    public static boolean detectCyc(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast== slow){
                return true;   // Cycle exists
            }
        }
        return false;
    }


    // Q2 Remove Cycle in ll
    public static void removeCyc(){
        // Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                cycle = true;
                break;   // coz dono pointer ko abhi hame wahi pe rakh na hai 
            }
        }
        if(cycle==false){
            return;
        }
        // find meeting pt
        slow = head;
        Node prev = null;  // last node
        while (slow!=fast) {   // dono 2nd time meet karre hai
            slow = slow.next;  // slow +1
            prev = fast;
            fast = fast.next;// fast +1
        }

        // remove cycle
        prev.next = null;
    }



    // Q3 Merge sort
    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;   // slow = mid        
    }

    public static Node merge (Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2 != null){
            if(head1.data <= head2.data){
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

        return mergedLL.next;
    }
    public static Node  Msort(Node head){  // Recursive fn hai isliya head parameter liya 
        if(head==null || head.next==null){
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
        CreationOfLL ll = new CreationOfLL();  // jo class banaya hai uska naam aaega yaha par
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(21);
        // ll.addLast(2);
        // ll.print();
        // ll.addAtMiddle(2, 5);
        // ll.print();
        // System.out.println("Size is "+ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println("Size is "+ll.size);
        // ll.removeLast();
        // ll.print();
        // System.out.println("Size is "+ll.size);


        // // Q1 & Q2
        // ll.addFirst(5);
        // ll.addFirst(4);
        // ll.addFirst(3);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // System.out.println("Find idx at: "+ll.iterativeSearch(2));
        // System.out.println("Find idx at: "+ll.RecursiveSearch(5));
        // // Q3
        // ll.print();
        // ll.reverse();
        // ll.print();
        // //Q4
        // ll.deleteNthFromEnd(3);
        // ll.print();




    //     // Q5
    //     ll.addLast(1);
    //     ll.addLast(2);
    //     ll.addLast(1);
    //     System.out.println(ll.checkPalendrom());



    // 2nd lecture
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // // 1->2 -> 3->1
        // // Q1
        // System.out.println(detectCyc());
        // //Q2
        // removeCyc();
        // System.out.println(detectCyc());  // hum check karre hai ki remove karne ke baad cycle exist kari hai ya nhi

        // Q3
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        Msort(ll.head);
        ll.print();
    }
}

