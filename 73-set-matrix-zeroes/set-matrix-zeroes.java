class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length , col = matrix[0].length;

        //flag to track if first row should be zero;
        boolean firstRowZero = false;
        //flag to track if first col should be zero
        boolean firstColZero = false;

        //check if 1st row has any zero
        for(int j=0;j<col;j++){
            if(matrix[0][j]==0){
                firstRowZero = true;
                break;
            }
        }

        //check if 1st col has any zeros
        for(int i =0;i<row;i++){
            if(matrix[i][0]==0){
                firstColZero = true;
                break;
            }
        }

        //use 1st row/column as markers
        for(int i =1;i<row;i++){
            for(int j =1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        //set cells to zero based on marker
        for(int i=1;i<row;i++){
            for(int j =1;j<col;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] =0;
                }
            }
        }
        //zero the first row if needed
        if(firstRowZero){
            for(int i =0;i<col;i++){
                matrix[0][i] = 0;
            }
        }
        if(firstColZero){
            for(int i =0;i<row;i++){
                matrix[i][0]=0;
            }
        }

    }
}