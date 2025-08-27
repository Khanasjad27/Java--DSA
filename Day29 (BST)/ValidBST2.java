import java.util.*;
public class ValidBST2 {
 
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    
    public static Node Insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            // left subtree
            root.left = Insert(root.left,val);
        }else{
            // right subtree
            root.right = Insert(root.right,val);
        }

        return root;
    }

    public static void Inorder(Node root){
        if(root == null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    public static boolean isBST(Node root, Node min, Node max){
        if(root == null) return true;

        if(min!=null && root.data<=min.data) return false;

        if(max!=null && root.data>=max.data) return false;

        return isBST(root.left, min, root) && isBST(root.right, root, max);
    }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = Insert(root, val[i]);
        }

        Inorder(root);
        System.out.println();
        System.out.println(isBST(root, null, null));
    }

}

