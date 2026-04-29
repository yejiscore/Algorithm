class Solution {
    public int solution(int n) {
        
        // 3진법 변환
        String three_n = "";
        
        while (n > 0) {
            three_n += Integer.toString(n % 3);
            n /= 3;
        }
        
        // 10진법 표현
        int cnt = three_n.length() - 1;
        int answer = 0;
        
        for (int i = 0; i < three_n.length(); i++) {
            answer += (three_n.charAt(i) - '0') * Math.pow(3, cnt);
            cnt--;
        }
        
        return answer;
    }
}