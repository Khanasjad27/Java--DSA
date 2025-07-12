import java.util.*;

public class FLOYDSTriangle{
    public static void FLOYDS(int n){
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        FLOYDS(n);

    }
}