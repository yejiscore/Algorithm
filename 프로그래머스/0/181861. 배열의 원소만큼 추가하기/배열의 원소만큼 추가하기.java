import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            answer.addAll(Collections.nCopies(arr[i], arr[i]));
        }

        int[] result = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}