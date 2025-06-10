class Solution {
    public String solution(String s) {
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        
        if (length % 2 == 0) {
            sb.append(s.charAt(length/2-1));
            sb.append(s.charAt(length/2));
        } else {
            sb.append(s.charAt(length/2));
        }
        
        return sb.toString();
    }
}