class Solution {
    public int solution(int num) {
        
        int answer = 0;
        long longnum = num;
        
        while (longnum != 1 && answer < 500) {
            if (longnum % 2 == 0) {
                longnum /= 2;
            } else {
                longnum = longnum * 3 + 1;
            }
            answer++;
        }
        
        return (longnum == 1) ? answer : -1;
    }
}