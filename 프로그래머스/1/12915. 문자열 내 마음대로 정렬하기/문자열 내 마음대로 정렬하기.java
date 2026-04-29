import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] answer = Arrays.copyOf(strings, strings.length);
        
        Arrays.sort(answer, (a, b) -> {
            // 마지막 조건 (인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.)
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            
            return a.charAt(n) - b.charAt(n);
        });
        
        return answer;
    }
}