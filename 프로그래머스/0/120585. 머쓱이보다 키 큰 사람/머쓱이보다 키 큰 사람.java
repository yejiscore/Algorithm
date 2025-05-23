class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int n = array.length;
        
        for (int i = 0; i < n; i++) {
            if (array[i] > height) answer++;
        }
        
        return answer;
    }
}