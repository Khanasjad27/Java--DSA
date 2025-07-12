// package Day11;

import java.util.Scanner;

public class LargestNSmallestIn2D { 
    public static void Largest(int matrix[][]){
        int max = Integer.MIN_VALUE;
        int n = matrix.length , m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                max = Math.max(max, matrix[i][j]);
            }
        }
        System.out.println("The maximum number in matrix is: "+max);
    }

    public static void Smallest(int matrix[][]){
        int min = Integer.MAX_VALUE;
        int n = matrix.length , m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                min = Math.min(min, matrix[i][j]);
            }
        }
        System.out.println("The minimum number in matrix is: "+min);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int matrix[][] = new int[3][3];
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
        Largest(matrix);

        Smallest(matrix);
    }
}
