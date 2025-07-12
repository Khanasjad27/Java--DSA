import java.util.*;

public class Butterfly{
    public static void Butterfly(int n){
        // 1st half
        for(int i=1;i<=n;i++){ 
            // Stars => i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces => 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Stars => i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
        // 2nd half
        for(int i=n;i>=1;i--){ 
            // Stars => i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces => 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Stars => i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        Butterfly(n);

    }
}