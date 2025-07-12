// Display all number entered by user except Multiple of 10 using continue

import java.util.*;

public class ContinueQues{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("enter number: ");
            n = scn.nextInt();
            if(n%10 == 0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}