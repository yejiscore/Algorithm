class Solution {
    public String solution(String phone_number) {
        
        int n = phone_number.length();
        
        String securePhoneNumber = "*".repeat(n-4);
        String lastFourPhoneNumber = phone_number.substring(n-4, n);
        
        String answer = securePhoneNumber + lastFourPhoneNumber;
        
        return answer;
    }
}