import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        // 기본값 true
        // 소수가 아니라고 판명되면 false
        boolean[] IsPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            IsPrime[i] = true;
        }
        
        // n의 제곱근까지 수행
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!IsPrime[i]) {
                continue;
            }
            
            // 배수 제거
            // i의 첫번째 배수인 2xi 부터 시작
            // 3xi, 4xi, ... 쭉 배수로 가야하므로
            // j에 계속 i 더하기
            // 배수라면 false
            for (int j = i+i; j <= n; j = j + i) {
                IsPrime[j] = false;
            }
        }
        
        // 소수 출력
        for (int i = m; i <= n; i++) {
            if (IsPrime[i]) {
                System.out.println(i);
            }
        }
    }
}