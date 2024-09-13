import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        // 0분 미만이면 minute+60 hour-1
        // hour 이 -1이라면 23으로 바꾸기
        minute -= 45;
        if (minute < 0) {
            minute += 60;
            hour -= 1;
        }
        if (hour == -1) hour = 23;

        System.out.printf("%d %d", hour, minute);
    }
}