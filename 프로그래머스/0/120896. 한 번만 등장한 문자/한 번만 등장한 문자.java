import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        int[] count = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        
        String answer = "";
        
        for(int i = 0; i < 26; i++){
            if(count[i] == 1){
                answer += (char)(i + 'a');
            }
        }
        
        return answer;
    }
}