import java.util.Scanner;

public class SearchInSortedMarrix {
    public static boolean search(int matrix[][], int key){
        int row = 0, col = matrix.length-1;

        while(row < matrix.length  && col >=0){
            if(matrix[row][col]  == key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not Found");
        return false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int matrix[][] = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
        int key = 10;
        search(matrix, key);
    }
}
