class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int leng = num_list.length;
        
        int listnum = leng / n;
        if (leng % n != 0) listnum++;
        
        int[] answer = new int[listnum];
        
        for (int i = 0, j = 0; i < leng; i += n, j++) {
            answer[j] = num_list[i];
        }
        
        return answer;
    }
}