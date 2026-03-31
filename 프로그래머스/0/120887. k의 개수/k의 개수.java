class Solution {
    public int solution(int i, int j, int k) {
        
        int count = 0;
        
        for(int n = i; n <= j; n++){
            String str = String.valueOf(n);
            
            for(int t = 0; t < str.length(); t++){
                if(str.charAt(t) - '0' == k){
                    count++;
                }
            }
        }
        
        return count;
    }
}