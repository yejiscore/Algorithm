class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if (s.charAt(0) == '-') {
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(0);
            answer = Integer.parseInt(sb.toString()) * -1;
        } else {
            answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}