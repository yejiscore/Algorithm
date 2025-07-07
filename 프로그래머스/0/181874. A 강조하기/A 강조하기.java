class Solution {
    public String solution(String myString) {
        
        StringBuilder result = new StringBuilder();
        
        for (char ch : myString.toCharArray()) {
            if (ch == 'a') {
                result.append('A');
            } else if (ch != 'A' && ch >= 'A' && ch <= 'Z') {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}