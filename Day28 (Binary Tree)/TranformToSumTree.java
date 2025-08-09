import java.util.*;

public class TranformToSumTree {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }

        int leftchild = sum(root.left);
        int rightchild = sum(root.right);
        int data = root.data;

        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;
        /* root.data = leftchild + root.left.data + rightchild + root.right.data;
         * ya nhi likh rahe hai coz ek error aara hai i.e root.left.data null hojara hai isliya upar waal likhe hai same for right
         */
        
        root.data = leftchild + newleft + rightchild + newright;
        return data;
    }
    
    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
         /*
                    1
                   / \
                  2   3  
                /  \ / \
               4   5 6  7  
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        sum(root);
        preOrder(root);

    }
}

