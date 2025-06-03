class Solution {
    public int solution(int a, int b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        
        String strAB = strA + strB;
        
        int AB = Integer.parseInt(strAB);
        int multi = 2 * a * b;
        
        return (AB >= multi) ? AB : multi;
    }
}