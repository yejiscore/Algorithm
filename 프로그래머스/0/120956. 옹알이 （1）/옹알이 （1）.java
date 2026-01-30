class Solution {
    public int solution(String[] babbling) {
        int cnt = 0;

        // 머쓱이가 할 수 있는 발음
        String[] targets = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            // 문자열은 불변이므로 복사본 temp 사용
            String temp = b;
            // 이전에 제거한 발음을 기억
            String lastRemoved = "";
            boolean valid = true;

            while (!temp.isEmpty()) {
                boolean removed = false;

                // 가능한 발음 순회
                for (String t : targets) {
                    // 현재 문자열이 t로 시작하고, 이전 제거한 발음과 다르면 제거
                    if (temp.startsWith(t) && !t.equals(lastRemoved)) {
                        temp = temp.substring(t.length()); // 발음 제거
                        lastRemoved = t;                  // 마지막 발음 업데이트
                        removed = true;                   // 제거 성공
                        break;
                    }
                }

                // 어떤 발음도 제거되지 않으면 불가능한 문자열
                if (!removed) {
                    valid = false;
                    break;
                }
            }

            // 모든 발음을 제거하고 valid이면 카운트
            if (valid) {
                cnt++;
            }
        }

        return cnt;
    }
}