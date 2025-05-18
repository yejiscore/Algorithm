class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int m = my_string.length();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}