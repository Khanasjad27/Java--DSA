
import java.util.Scanner;

public class Spiral {
    public static void spiralPatten(int matrix[][]) {
        int n = matrix.length , m = matrix[0].length;
        int sr = 0; // startRow
        int sc = 0; // startColumn
        int er = n-1; // endrow
        int ec = m-1; // endcol

        // j-> for column and i -> row
        while (sr <= er && sc <= ec) {
            // top
            for(int j=sc;j<=ec;j++){   
                System.out.print(matrix[sr][j]+" ");
            }
            // right
            for(int i =sr+1;i<=er;i++){      // sc+1 coz column jab print karre the tab column ka jo last element hai wo row ka 1st hai
                System.out.print(matrix[i][ec]+" ");
            }
            // bottom
            for(int j=ec-1;j>=sc;j--){   
                if(sr == er){
                    break;
                }
                System.out.print(matrix[er][j]+" ");
            }
            // left
            for(int i =er-1;i>=sr+1;i--){      
                if(sc == ec ){
                    break;
                }
                System.out.print(matrix[i][sc]+" ");
            }
            sr++;
            ec--;
            sc++;
            er--;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int matrix[][] = new int[4][4];
        int n = matrix.length , m = matrix[0].length;

        // intput
        System.out.println("Enter Elements: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = scn.nextInt();
            }
        }

        // output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Final output in Spiral patten");
        spiralPatten(matrix);
    }
}
