import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        // 자기 자신을 미리 포함
        int count = 1; 
        int sum = 1;

        // 투 포인터
        int start = 1;
        int end = 1;

        // 자기 자신을 포함하지 않기 위해
        while (end != N) {
            // 현재 연속 합이
            // N과 같을 경우
            if (sum == N) {
                count++;
                end++;
                sum += end;
            }
            // N보다 작을 경우
            else if (sum < N) {
                end++;
                sum += end;
            }
            // N보다 클 경우
            else {
                sum -= start;
                start++;
            }
        }
        System.out.println(count);
    }
}