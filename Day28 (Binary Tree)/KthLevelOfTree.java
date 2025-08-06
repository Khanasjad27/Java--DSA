import java.util.*;

public class KthLevelOfTree {
    static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Approch 1  => Level based approch
    public static void kthLevel1(Node root, int k){
        Queue<Node> q = new LinkedList<>();
        int level = 1;
        if(root == null){
            return;
        }
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println();
                level++;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                if(level == k){
                    System.out.print(curr.data+" ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }

    // Approch 2
    public static void Klevel(Node root,int level, int k){
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
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

        // Approch 1
        kthLevel1(root, 3);

        // Approch 2
        Klevel(root, 1, 2);
    }
}
