import java.util.*;
public class CountOfNodes {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int nodeCount(Node root){
        if(root == null){
            return 0;
        }
        int lh = nodeCount(root.left);
        int rh = nodeCount(root.right);

        return lh+rh+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(nodeCount(root));
    }
}
