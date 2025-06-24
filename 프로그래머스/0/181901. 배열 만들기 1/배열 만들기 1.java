class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        for (int i = 1, j = 0; i <= n/k; i++, j++) {
            answer[j] = k*i;     
        }
        
        return answer;
    }
}