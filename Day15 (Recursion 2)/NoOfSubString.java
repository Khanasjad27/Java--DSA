// package Day15 (Recursion 2);
// We are given a string S,we need to find the count of all contiguous substrings starting and ending with the same character
// There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b Out of the above substrings,there are 7 substrings:a,abca,b,bcab,c,a and b.So,only 7 contiguous substrings start and end with the same character

public class NoOfSubString {
    public static void number(String str){
        int n = str.length();
        int si = 0;
        int ei = n-1;
        for(int i=0;i<n;i++){
        

    }
    public static void main(String[] args) {
        String str = "abcab"   ;
        number(str);
    }
}
