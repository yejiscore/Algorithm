import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        int n = 1;
        int cnt = 1;
        
        while (n < arr.length) {
            n *= 2;
            cnt++;
        }
        
        int[] answer = Arrays.copyOf(arr, n);
        
        return answer;
    }
}