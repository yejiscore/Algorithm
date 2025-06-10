class Solution {
    public long solution(int price, int money, int count) {
        
        long neededMoney = 0L;
        
        for (int i = 1; i < count+1; i++) {
            neededMoney += (long) price * i;
        }
        
        long currentMoney = (long) money;
        long answer = 0L;
        if (neededMoney > currentMoney) answer =  neededMoney - currentMoney;
        
        return answer;
    }
}