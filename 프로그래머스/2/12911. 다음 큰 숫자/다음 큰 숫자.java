class Solution {
    public int solution(int n) {
        
        int binaryOneN = countBinaryOnes(n);
        
        int i = 1;
        
        while (true) {
            int target = n+i;
            if (countBinaryOnes(target) == binaryOneN) {
                return target;
            } else i++;
        }
    }
    
    // 2진수 변환 시 1의 개수 구하는 함수
    public int countBinaryOnes(int m) {
        int cnt = 1;
        
        while (m > 1) {
            if (m % 2 == 1) {
                cnt++;
            }
            m /= 2;
        }
        
        return cnt;
    }
}