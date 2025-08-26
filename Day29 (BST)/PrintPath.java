import java.util.*;

public class PrintPath {    
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

    public static void printThePath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }

    public static void printPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        path.add(root.data); 

        if(root.left == null && root.right == null){
            printThePath(path);
        }
        printPath(root.left, path);
        printPath(root.right, path);
        path.remove(path.size()-1); // since we r doing recursion therfore we are assuming that jitni bhi cheeze add hui hai wo rwmovw bhi ho jaaegi tjere fore humhi bache hai remove honekeliya
        // upar index daalna tha isliya "path.size()-1" likhe
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

    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = Insert(root, val[i]);
        }

        Inorder(root);
        System.out.println("All the path are listed below");
        printPath(root, new ArrayList<>());
    }
}

