class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        
        int top = 0;//starting row
        int bottom = row-1;//ending row
        int left =0;// starting col
        int right =col-1;//ending col
        while(top <= bottom && left <= right){
            for(int i=left ; i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i =top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if( top<=bottom){
                for(int i =right;i>=left;i--){
                result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}