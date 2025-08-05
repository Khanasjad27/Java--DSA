import java.util.*;

public class DiameterOfTree2 {

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        int diam;
        int ht;

        Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){

        if(root == null){
            return new Info(0, 0);
        }
        // issse muje apne left n right subtree ki Info milgai i.e height n diam
        Info lInfo = diameter(root.left);  
        Info rInfo = diameter(root.right);

        int diameter = Math.max(Math.max(lInfo.diam, rInfo.diam),(lInfo.ht+rInfo.ht+1));
        int ht = Math.max(lInfo.ht, rInfo.ht) + 1;

        return new Info(diameter,ht);
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
        System.out.println("Height of tree: "+diameter(root).ht);
        System.out.println("Diameter of tree: "+diameter(root).diam);
    }
}
