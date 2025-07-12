import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int sum = num1 + num2;
        int mul = num1*num2;
        System.out.println(sum);
        System.out.println(mul);
    }
}