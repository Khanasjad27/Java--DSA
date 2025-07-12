import java.util.*;

public class HollowRectriangle{
    public static void Rectriangle(int n, int m){
        for(int i =1; i<=n;i++){
            for(int j = 1 ; j<=m;j++){
                if((i == 1 || i ==n) || (j == 1 || j ==m)){
                System.out.print("* ");
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int n = scn.nextInt();
        System.out.print("Enter column number: ");
        int m = scn.nextInt();
        Rectriangle(n,m);

    }
}