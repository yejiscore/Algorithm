class Solution {
    public int solution(int[] date1, int[] date2) {

        int i = 0;
        
        while (i < 3) {
            if (date1[i] < date2[i]) {
                return 1;
            } else if (date1[i] > date2[i]) {
                return 0;
            }
            i++;
        }
        
        return 0;
    }
}