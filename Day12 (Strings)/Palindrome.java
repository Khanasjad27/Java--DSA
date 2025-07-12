import java.util.Scanner;

public class Palindrome {
    public static boolean isPalendrome(String str){
        int n = str.length();
        for(int i=0;i<n/2;i++){
            // not a palimdrome
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter name: ");
        String str = scn.nextLine();
        System.out.println(isPalendrome(str));
    }
}
