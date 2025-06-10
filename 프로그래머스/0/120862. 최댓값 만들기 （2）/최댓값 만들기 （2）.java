class Solution {
    public int solution(int[] numbers) {

        int length = numbers.length;
        int answer = Integer.MIN_VALUE;
        
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                int target = numbers[i] * numbers[j];
                if (target > answer) answer = target;
            }
        }
        
        return answer;
    }
}