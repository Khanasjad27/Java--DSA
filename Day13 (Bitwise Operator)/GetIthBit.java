// package Day13 (Bitwise Operator);
import java.util.Scanner;
public class GetIthBit {
    public static int check(int n,int i){
        int bitmask = 1<<i;
        if((bitmask & n) == 0){   // single "&" Decimal ko Binary me convert karke check karega 
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number in Decimal: ");
        int n = scn.nextInt();
        System.out.print("Enter position: ");
        int i = scn.nextInt();
        System.out.println(check(n,i));
    }
}

