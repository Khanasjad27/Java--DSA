// package Day18 (BackTracking);

public class Sudoku {

    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        // column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]== digit)
                return false;
        }

        // row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]== digit)
                return false;
        }

        // grid
        int sr = (row/3)*3 , sc = (col/3)*3;
        for(int i=sr;i<sr+1;i++){
            for(int j=sc;j<sc+1;j++){
                if(sudoku[i][j]== digit)
                    return false;
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        // base case
        if(row==9 ){  // coz last line me hai
            return true;
        }
        // recursion
        int newRow = row, nextCol = col+1; // har baar hum column me move karre hai isliya col+1
        // row tab baregi jab col kii val 9 hojaae i.e last me aajaae
        if(col+1 == 9){
            newRow= row+1;
            nextCol = 0; // coz ab hum suru se start karege 2nd row me
        }
        // ya tab karna hai jab non zero ho
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, newRow, nextCol); // yaha next me chalegai
        }
        
        // ya sub kaam tab karna hai jab digit zero ho
        for(int digit=1;digit<=9;digit++){ // loop 1 to 9 coz total 9 digit hoge
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, newRow, nextCol)){  // jab ya solution true return karega therefore solution exist
                    return true;
                }
                sudoku[row][col] = 0; // agar solution false return kiya to
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<sudoku.length;i++){
            for(int j=0;j<sudoku.length;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int sudoku[][] = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printSudoku(sudoku);
        }else{
            System.out.println("Solution does not exists");
        }
    }
}
