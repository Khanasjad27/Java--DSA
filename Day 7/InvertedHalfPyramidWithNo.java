import java.util.*;

public class InvertedHalfPyramidWithNo{
    public static void InvertedHalfPyramidWithNo(int n){
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        InvertedHalfPyramidWithNo(n);

    }
}