import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] split_my_string = my_string.split(" ");
        int n = split_my_string.length;
        List<String> answer = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String a = split_my_string[i];
            if (!a.equals("")) {
                answer.add(a);
            }
        }
        return answer.toArray(new String[0]);
    }
}