class Solution {
    public long solution(int a, int b) {
        
        if (a == b) {
            return a;
        } else {
            int bigger = Math.max(a, b);
            int smaller = Math.min(a, b);

            long n = bigger - smaller + 1;

            long answer = (bigger + smaller) * n / 2;

            return answer;
        }
    }
}