// package Day14 (Recurssion 1);
import java.util.Scanner;
public class PrintNoInIncreasingOrder {
    public static void print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        print(n);
    }
}
