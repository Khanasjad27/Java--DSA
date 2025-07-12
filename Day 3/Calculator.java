import java.util.*;

public class Calculator{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = scn.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = scn.nextInt();
        System.out.println("Enter Character: ");
        char ch = scn.next().charAt(0);
        switch(ch) {
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '%' :
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}