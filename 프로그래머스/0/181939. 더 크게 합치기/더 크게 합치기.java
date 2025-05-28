class Solution {
    public int solution(int a, int b) {
        String strab = String.valueOf(a) + String.valueOf(b);
        String strba = String.valueOf(b) + String.valueOf(a);
        
        int ab = Integer.parseInt(strab);
        int ba = Integer.parseInt(strba);
        
        return ab > ba ? ab : ba;
    }
}