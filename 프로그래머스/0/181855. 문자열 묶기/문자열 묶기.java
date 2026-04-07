class Solution {
    public int solution(String[] strArr) {
        
        int[] cnt = new int[31];
        
        for(String s : strArr){
            cnt[s.length()]++;
        }
        
        int max = 0;
        
        for(int c : cnt){
            if(c > max){
                max = c;
            }
        }
        
        return max;
    }
}