// package Day15 (Recursion 2);

public class TowerOfHanoi {
    public static void Hanoi(int n, String A,String B, String C ){
        // Base Case
        if(n==0){
            return;
        }
        // Smaller Problem -> Transfering n-1 Disk from A to B using C
        Hanoi(n-1,A,C,B);
        // // jo last disk hai bachi hui usko trasfer kiya
        System.out.println("Transfer Disk "+n+ " from "+A+" to "+C); 
        // Ab apne paas saari disk B me hai usko tranfer karna hai to C using A
        Hanoi(n-1,B,A,C);
    }
    public static void main(String[] args) {
        int n = 3;
        Hanoi(n, "A", "B", "C");
    }
}
