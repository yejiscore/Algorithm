class Solution {
    public int[] solution(int n, int m) {
        
        int[] answer = new int[2];
        
        int gcd = gcd(n, m);
        
        answer[0] = gcd;
        answer[1] = (n / gcd) * m; // 최소공배수
        
        return answer;
    }
    
    // 최대공약수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}