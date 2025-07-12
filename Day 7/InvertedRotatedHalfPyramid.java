import java.util.*;

public class InvertedRotatedHalfPyramid{
    public static void InvertedStar(int n){
        for(int i=1;i<=n;i++){
            // Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        InvertedStar(n);

    }
}