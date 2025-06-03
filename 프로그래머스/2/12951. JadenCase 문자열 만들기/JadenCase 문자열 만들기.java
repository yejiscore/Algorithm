class Solution {
    public String solution(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        
        if (Character.isLowerCase(sb.charAt(0))) {
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        }
        
        for (int i = 1; i < n-1; i++) {
            if (sb.charAt(i) == ' ' && Character.isLowerCase(sb.charAt(i+1))) {
                sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
            }
        }
        
        return sb.toString();
    }
}