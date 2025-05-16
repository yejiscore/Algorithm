class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        
        int[] answer = new int[2];
        
        for (int i = 0; i < n; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}