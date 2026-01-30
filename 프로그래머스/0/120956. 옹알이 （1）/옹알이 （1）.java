class Solution {
     public static int solution(String[] babbling) {
        int answer = 0;
         
        // 머쓱이가 할 수 있는 발음
        String[] targets = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            
            // 현재 단어에서 가능한 발음(targets)에 해당하는 문자열을 공백으로 치환
            for (int j = 0; j < targets.length; j++) {
                babbling[i] = babbling[i].replace(targets[j], " ");
            }
            
            // trim()으로 공백 제거 후 빈 문자열인지 확인
            if ("".equals(babbling[i].trim())){
                answer = answer + 1;
            }
        }
        return answer;
    }
}