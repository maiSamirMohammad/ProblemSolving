class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> res = new ArrayList<>();
        
        if (matrix.length == 0) return res;
        
        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;

        while (left < right && top < bottom) {
            // get every element in the top row
            for (int i = left; i < right; i++) {
                res.add(matrix[top][i]);
            }
            top += 1;

            // get every element in the right column
            for (int i = top; i < bottom; i++) {
                res.add(matrix[i][right - 1]);
            }
            right -= 1;

            if (!(left < right && top < bottom)) {
                break;
            }

            // get every element in the bottom row
            for (int i = right - 1; i >= left; i--) {
                res.add(matrix[bottom - 1][i]);
            }
            bottom -= 1;

            // get every element in the left column
            for (int i = bottom - 1; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            left += 1;
        }

        return res;
    }
}