import java.util.*;

public class SumOFN{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number for calculation of Sum: ");
        int n = scn.nextInt();

        int i = 1;
        int sum = 0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}