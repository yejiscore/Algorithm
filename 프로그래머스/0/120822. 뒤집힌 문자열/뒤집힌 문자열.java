class Solution {
    public String solution(String my_string) {
        String answer = "";
        int n = my_string.length();
        for (int i = 0; i < n; i++) {
            answer += my_string.charAt(n-i-1);
        }
        return answer;
    }
}