import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;

        int[] answer = new int[len];

        for (int i = 0; i < len - n; i++) {
            answer[i] = num_list[n + i];
        }

        for (int i = 0; i < n; i++) {
            answer[len - n + i] = num_list[i];
        }

        return answer;
    }
}