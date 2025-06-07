class Solution {
    public int solution(int[] num_list) {
        
        StringBuilder odd = new StringBuilder("");
        StringBuilder even = new StringBuilder("");
        
        for (int i = 0; i < num_list.length; i++) {
            int target = num_list[i];
            if (target % 2 == 1) {
                odd.append(target);
            } else {
                even.append(target);
            }
        }
        
        int answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        
        return answer;
    }
}