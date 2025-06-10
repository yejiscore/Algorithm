import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String result = new String(arr);
        
        StringBuilder sb = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}