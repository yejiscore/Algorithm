class Solution {
    public int solution(int left, int right) {
        
        int answer = 0;
        
        for (int i = left; i < right + 1; i++) {
            if (isSquare(i)) answer -= i;
            else answer += i;
        }
        
        return answer;
    }
    
    public boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}