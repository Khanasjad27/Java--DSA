import java.util.*;
public class DeleteNode {
    
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

    // Deleting in BST
    
    public static Node Delete(Node root, int val){
        if(root.data> val){
            root.left = Delete(root.left,val);
        }else if(root.data< val){
            root.right = Delete(root.right, val);
        }else{
            // case 1: leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            // case2: only 1 child
            else if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            // case 3 : two child
            else{
            Node IS = findInorderSuccesor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right, IS.data);
            }
        }
        return root;
    }

    public static Node findInorderSuccesor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }


    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = Insert(root, val[i]);
        }

        Inorder(root);
        System.out.println();
        // System.out.println();
        // System.out.println(searchInBST(root, 0));

        root = Delete(root, 4);
        Inorder(root);
    }
}
