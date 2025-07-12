import java.util.*;

public class PrimeOrNot{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scn.nextInt();
        boolean is_Prime = true;

        if(n == 2){
            is_Prime = false;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                is_Prime = false;
                break;
            }
        }
        if(is_Prime == false){
            System.out.println(n+" is not prime");
        }
        else{
            System.out.println(n+" is prime");
        }
        }
    } 
}