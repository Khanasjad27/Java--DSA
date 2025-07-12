// package Day18 (BackTracking);

public class CountTotalWaysOfNQueens {

    static int Count = 0;

    public static boolean isSafe(char board[][], int row,int col){
        // vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q')
                return false;
        }

        // Diagonal left Up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q')
                return false;
        }

        // Diagonal right Up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q')
                return false;
        }
        return true;
    }
    public static void nQueens(char board[][],int row){


        // base
        if(row == board.length){
            // printBoard(board);  // ya condition for printing all solution
            Count++;
            return;

        }

        // yaha ek ek columm me jaauga aur waha queen ko baithauga
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';  // yaha bigar dekhe ki queen ko bithana safe hai ki nhi mai sirf queen ko bithaduga
                nQueens(board, row+1); // fn call
                board[row][j] = 'X';  // backtracking step
            }
        }

    }

    public static void printBoard(char board[][]){
        System.out.println("----Chees Board----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        // initialize chees board
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueens(board,0);
        System.out.println("Total ways to solve " + n+" queens = "+Count);
    }
}
