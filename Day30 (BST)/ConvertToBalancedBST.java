import java.util.*;
public class ConvertToBalancedBST {
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
    // public static Node MinHeightBST( int arr[], int si, int ei){
    //     if(si>ei){
    //         return null;
    //     }

    //     int mid = (si+ei)/2;
    //     Node root = new Node(arr[mid]);

    //     // leftSubtree
    //     root.left = MinHeightBST( arr, si, mid-1);
    //     // rightSubtree
    //     root.right = MinHeightBST(arr, mid+1, ei);

    //     return root;
    // }

    // upar jo code likha tha wahi niche likh rahe hai but using arraylist
    public static Node MinHeightBST(ArrayList<Integer> list, int si, int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(list.get(mid));
        root.left = MinHeightBST(list, si, mid-1);
        root.right = MinHeightBST(list, mid+1, ei);

        return root;
    }

    public static void Preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void Inorder(Node root, ArrayList<Integer> list){
        if(root == null){
            return;
        }
        Inorder(root.left,list);
        list.add(root.data);
        Inorder(root.right,list);
    }

    public static Node BlancedBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        // Innorder using arraylist
        Inorder(root, list);

        // min height balanced BST
        return MinHeightBST(list, 0, list.size()-1);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right= new Node(12);

        root = BlancedBST(root);
        Preorder(root);
    }
}
