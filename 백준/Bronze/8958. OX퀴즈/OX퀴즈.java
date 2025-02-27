import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            int score = 0;

            String oxtest = br.readLine();
            
            // 향상된 for문 사용
            for (char c : oxtest.toCharArray()) {
                if (c == 'O') {
                    cnt++;
                    score += cnt;
                } else if (c == 'X') {
                    cnt = 0;
                }
            }
            System.out.println(score);
        }
    }
}