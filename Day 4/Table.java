import java.util.*;

public class Table{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        System.out.print("ENter number: ");
        int n = scn.nextInt();
        
        for(int i =1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}