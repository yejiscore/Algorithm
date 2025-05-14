class Solution {
    public int solution(int n) {
        if (n % 2 == 1) n -= 1;
        int answer = 0;
        while (n >= 2) {
            answer += n;
            n -= 2;
        }
        return answer;
    }
}