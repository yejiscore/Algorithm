class Solution {
    public String solution(String s) {
        String[] parts = s.split(" ");
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (min > num) min = num;
            if (max < num) max = num;
        }
        
        return min + " " + max; 
    }
}