// package Day13 (Bitwise Operator);
import java.util.*;
public class UpdateIthBit {
    public static int set(int n,int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clear(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int update(int n, int i, int newVal){ // newVal = 0 or 1
        // if(newVal == 0){
        //     return clear(n, i);
        // }else{
        //     return set(n, i);
        // }

        n = clear(n, i);
        int bitmask = newVal<<i;
        return n|bitmask;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number in Decimal: ");
        int n = scn.nextInt();
        System.out.print("Enter position: ");
        int i = scn.nextInt();
        System.out.print("Enter value(0 or 1): ");
        int newVal = scn.nextInt();     
        System.out.println(update(n, i, newVal));
    }
}
