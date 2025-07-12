import java.util.*;

public class SolidRhombus{
    public static void SolidRhombus(int n){
        for(int i=1;i<=n;i++){ 
            // spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //Stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        SolidRhombus(n);

    }
}