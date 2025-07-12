// package Day18 (BackTracking);

public class FindPermutation {
    public static void Permutation(String str, String ans){
        // Base Case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        // Recursion
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            // Ya currChar ko apne SString ke andar se delete karna hai taaki wo aage waalw recursin me na aae
            // if str = "abcde" and mera current char hai c , therefore usko kaise remove karuga
            // "ab"+"de"; aise karuga
            String newStr = str.substring(0, i)+str.substring(i+1);
            Permutation(newStr, ans+currChar);
        }


    }
    public static void main(String[] args) {
        String str = "abc";
        Permutation(str, "");
    }
}
