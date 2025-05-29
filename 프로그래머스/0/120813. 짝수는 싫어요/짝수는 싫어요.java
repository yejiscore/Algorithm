class Solution {
    public int[] solution(int n) {
        
        int num = n;
        if (num % 2 != 0) num += 1;
        num /= 2;
        
        int[] answer = new int[num];
        
        for (int i = 0; i < num; i++) {
            answer[i] = i * 2 + 1;
        }
        
        return answer;
    }
}