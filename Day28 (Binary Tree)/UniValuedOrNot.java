import java.util.*;

public class UniValuedOrNot {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isUnivalid(Node root){
        if(root == null){
            return true;
        }

        isUnivalid(root.left);
        isUnivalid(root.right);
        if(root.data == root.left.data && root.data == root.right.data){
            return true;
        }
        

        return true;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(isUnivalid(root));
    }
}
