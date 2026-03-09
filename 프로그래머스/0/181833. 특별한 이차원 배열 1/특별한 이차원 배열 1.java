class Solution {
    public int[][] solution(int n) {
        
        // int형 배열의 기본값은 0으로 채워진다
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }
        
        return arr;
    }
}