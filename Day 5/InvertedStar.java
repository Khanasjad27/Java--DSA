import java.util.*;

public class InvertedStar{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();

        for(int i = 1;i<=n;i++){   // ya loop for column
            for(int j =1;j<=i;j++){   // this loop is for row
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}