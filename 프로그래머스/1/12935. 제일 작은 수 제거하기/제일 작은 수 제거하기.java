import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        }
        
        int min = arr[0];
        for (int num : arr) {
            if (min > num) min = num;
        }
        
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != min) list.add(num);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}