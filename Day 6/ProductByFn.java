import java.util.*;

public class ProductByFn{
    public static int Product(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = scn.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = scn.nextInt();
        int result = Product(a,b);
        System.out.print(result);
    }
}