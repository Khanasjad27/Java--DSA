import java.util.*;
public class ValidBST1 {
   
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
    // Approch 1
    // humne inorder nikal liya hai upar, now we will check if the list is in ascending order then we will return true

    public static void getInorder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        getInorder(root.left, list);
        list.add(root.data);
        getInorder(root.right, list);
    }
    public static boolean isBST1(Node root){
        ArrayList<Integer> InorderPath = new ArrayList<>();
        getInorder(root, InorderPath);
        for(int i=0;i<InorderPath.size()-1;i++){
            if(InorderPath.get(i)>=InorderPath.get(i+1)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = Insert(root, val[i]);
        }

        Inorder(root);
        System.out.println();
        System.out.println(isBST1(root));

        // humne to insertion function banaya hai usme hum koi bhi input daale wo have valid bst banake dega therefore hume alag se tree construct karna hoga fot check out code is valif for false statement or not


        // Invalid BST (manual construction)
        Node invalidRoot = new Node(8);
        invalidRoot.left = new Node(5);
        invalidRoot.right = new Node(10);

        // ❌ invalid placement: 9 is in left subtree of 8, but greater than 8
        invalidRoot.left.right = new Node(9);

        System.out.print("\nInorder (invalid): ");
        Inorder(invalidRoot);
        System.out.println("\nIs BST? " + isBST1(invalidRoot)); // ❌ false
    }
}
