class Solution {
    public String[] solution(String[] names) {
        int n = names.length;
        String[] answer = new String[(n + 4) / 5];

        for (int i = 0, j = 0; i < n; i += 5, j++) {
            answer[j] = names[i];
        }

        return answer;
    }
}