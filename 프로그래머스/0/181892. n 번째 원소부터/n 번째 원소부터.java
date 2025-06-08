class Solution {
    public int[] solution(int[] num_list, int n) {
        int leng = num_list.length;
        int[] answer = new int[leng - n + 1];
        
        for (int i = n-1, j = 0; i < leng; i++, j++) {
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}