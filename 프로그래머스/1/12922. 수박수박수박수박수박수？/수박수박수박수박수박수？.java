class Solution {
    public String solution(int n) {
        
        StringBuilder sb = new StringBuilder();
        int cnt = n / 2;
        
        for (int i = 0; i < cnt; i++) {
            sb.append("수박");
        }
        
        if (n % 2 != 0) sb.append("수");
        
        String answer = sb.toString();
        
        return answer;
    }
}