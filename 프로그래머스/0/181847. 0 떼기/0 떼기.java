class Solution {
    public String solution(String n_str) {
        int index = 0;

        // 앞에서부터 0 제거
        while (index < n_str.length() && n_str.charAt(index) == '0') {
            index++;
        }

        // 전부 0인 경우
        if (index == n_str.length()) {
            return "0";
        }

        return n_str.substring(index);
    }
}