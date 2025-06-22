class Solution {
    public int solution(int[] arr, int idx) {
        int cnt = arr.length;
        int answer = -1;
        
        for (int i = idx; i < cnt; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}