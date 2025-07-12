// package Day13 (Bitwise Operator);
import java.util.*;;
public class CountSetBit {
    public static int count(int n){
        int count = 0;
        while (n>0) {
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
       return count; 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number in Decimal: ");
        int n = scn.nextInt();
        System.out.println(count(n));
    }
}
