import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % divisor == 0) list.add(num);
        }
        
        if (list.isEmpty()) list.add(-1);
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}