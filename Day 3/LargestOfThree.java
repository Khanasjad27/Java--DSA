import java.util.*;

public class LargestOfThree{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is Greatest");
            }
            else{
                System.out.println(c+" is Greatest");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is Greatest");
            }
            else{
                System.out.println(c+" is Greatest");
            }
        }
    }
}