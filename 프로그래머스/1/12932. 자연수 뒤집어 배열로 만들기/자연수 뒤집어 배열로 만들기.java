class Solution {
    public int[] solution(long n) {

        String str = Long.toString(n);
        int length = str.length();
        
        int[] result = new int[length];
        
        for (int i = 0; i < length; i++) {
            result[i] = str.charAt(length - 1 - i) - '0';
        }
        
        return result;
    }
}