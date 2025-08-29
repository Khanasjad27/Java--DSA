public class SortedArrayToBST {

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
    public static Node MinHeightBST( int arr[], int si, int ei){
        if(si>ei){
            return null;
        }

        int mid = (si+ei)/2;
        Node root = new Node(arr[mid]);

        // leftSubtree
        root.left = MinHeightBST( arr, si, mid-1);
        // rightSubtree
        root.right = MinHeightBST(arr, mid+1, ei);

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
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
        Node root = MinHeightBST(arr, 0, arr.length-1);
        Preorder(root);
    }
}
