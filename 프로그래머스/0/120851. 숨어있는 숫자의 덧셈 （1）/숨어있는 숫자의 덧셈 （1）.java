import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer += my_string.charAt(i) - '0';
            }
        }
        
        return answer;
    }
}