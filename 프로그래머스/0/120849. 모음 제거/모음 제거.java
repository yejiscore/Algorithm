class Solution {
    public String solution(String my_string) {
        String answer = "";
        int n = my_string.length();
        
        for (int i = 0; i < n; i++) {
            char ch = my_string.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                answer += ch;
            }
        }
        
        return answer;
    }
}