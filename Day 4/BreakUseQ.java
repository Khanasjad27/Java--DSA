// if Multiple of 10 Encountered then end loop using break

import java.util.*;

public class BreakUseQ{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("enter number: ");
            n = scn.nextInt();
            if(n%10 == 0){
                break;
            }
        }while(true);
        System.out.println("Multiple of 10 Encountered");
    }
}