class Solution {
    public int solution(int n) {

        boolean[] IsPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            IsPrime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!IsPrime[i]) continue;

            for (int j = i + i; j <= n; j += i) {
                IsPrime[j] = false;
            }
        }

        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (!IsPrime[i]) {
                answer++;
            }
        }

        return answer;
    }
}