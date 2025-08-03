import java.util.*;

public class BuildTree {
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

    static class BinaryTree{
        static int idx = -1;

        // root node printing
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes); // preorder hai isliya plele left ko build liya by recursion
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // preOrder
        public static void preOrder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // Inorder
        public static void Inorder(Node root){
            if(root == null){
                return ;
            }

            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }

        // postOrder
        public static void postOrder(Node root){
            if(root == null){
                return ;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" "); 
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //  root
        // System.out.println(root.data);

        // preOrder
        System.out.print("PreOder: ");
        tree.preOrder(root);
        System.out.println();
        // Inorder
        System.out.print("InOder: ");
        tree.Inorder(root);
        System.out.println();
        // Inorder
        System.out.print("PostOrder: ");
        tree.postOrder(root);
    }
}
