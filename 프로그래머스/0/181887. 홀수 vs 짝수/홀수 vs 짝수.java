class Solution {
    public int solution(int[] num_list) {
        
        int odd_sum = 0;
        int even_sum = 0;
        
        for (int i = 0; i < num_list.length; i+=2) {
            odd_sum += num_list[i];
        }
        
        for (int i = 1; i < num_list.length; i+=2) {
            even_sum += num_list[i];
        }
        
        int answer = Math.max(odd_sum, even_sum);
        
        return answer;
    }
}