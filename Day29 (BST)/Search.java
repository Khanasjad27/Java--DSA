import java.util.*;

public class Search {

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

    // Search in BST
    public static boolean searchInBST(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }else if(root.data > key){
            // left subtree
            return searchInBST(root.left, key);
        }else {
            // right subtree
            return searchInBST(root.right, key);
        }
    }
    public static void main(String[] args) {
        int val[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = Insert(root, val[i]);
        }

        Inorder(root);
        System.out.println();
        System.out.println(searchInBST(root, 0));
    }
}

