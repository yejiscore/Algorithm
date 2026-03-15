class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            
            int target = num_list[i];
            
            while (target >= 2) {
                target /= 2;
                answer++;
            }
        }
        
        return answer;
    }
}