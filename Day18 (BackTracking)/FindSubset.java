// package Day18 (BackTracking);

public class FindSubset {
    public static void subset(String str,String ans,int i){
        // Base Case
        if(i==str.length()){
            if(ans.length() == 0){  // Agar ans String ki last val empty hai tab uski length zero hojaaegi
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        // recursion
        // Yes Choice
        subset(str, ans+str.charAt(i), i+1);
        // no Choice
        subset(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        subset(str, "", 0);
    }
}
