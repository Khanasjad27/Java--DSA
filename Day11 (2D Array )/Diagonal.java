import java.util.Scanner;

public class Diagonal {
    public static int diagonalSum(int matrix[][]){
        int n = matrix.length , m = matrix[0].length;

        int sum = 0;
        // not so Optimize code


        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         // For Primary Diogonal
        //         if(i==j){     // yaha pe overlapping waali condition satify hogai hai
        //             sum+=matrix[i][j];
        //         }
        //         // for Secondary Diagonal
        //         else if(i+j == n-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        // Optimize Code

        for(int i=0;i<n;i++){
            //primary Diagonal
            sum+=matrix[i][i];   // coz i == j there 2 loop likh ne ki zarurak hi nhi hai
            // Secondary Diagonal
            // wkt i+j = n-1 therefore j = n-1-i;
            if(i != n-1-i){    // ya condition hai i==j waali
                sum+=matrix[i][n-1-i];
            } 
        }
        return sum;      
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int martix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        System.out.println("The sum of Diagonal Elements is: "+diagonalSum(martix));
    }
}
