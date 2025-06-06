class Solution {
    public int solution(int[] num_list) {
        int plus = 0;
        int multiply = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            int answer = num_list[i];
            plus += answer;
            multiply *= answer;
        }
        
        return (multiply < (plus*plus)) ? 1 : 0;
    }
}