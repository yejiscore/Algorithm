class Solution {
    public int solution(int[] array, int n) {
        
        int answer = array[0];
        
        for(int i = 1; i < array.length; i++){
            
            int diff1 = Math.abs(array[i] - n);
            int diff2 = Math.abs(answer - n);
            
            if(diff1 < diff2 || (diff1 == diff2 && array[i] < answer)){
                answer = array[i];
            }
        }
        
        return answer;
    }
}