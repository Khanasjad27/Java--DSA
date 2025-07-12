// package Day15 (Recursion 2);

public class BinaryStringProblem {
    public static void Binary(int n, int lastplace, String str){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // kaam
        Binary(n-1, 0, str+"0"); // yaha pe maine lastplace pe 0 ko daal diya
        if(lastplace == 0){
            Binary(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        Binary(3, 0, "");
    }
}
