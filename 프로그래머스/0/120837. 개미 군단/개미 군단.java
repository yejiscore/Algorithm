class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5;
        int afterfivehp = hp % 5;
        
        answer += afterfivehp / 3;
        int afterthreehp = afterfivehp % 3;
        
        return answer + afterthreehp;
    }
}