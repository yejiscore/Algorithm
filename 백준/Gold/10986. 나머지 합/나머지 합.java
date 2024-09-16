import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // 나머지 합의 핵심 아이디어
        // 1. (A+B) % C = ((A % C) + (B % C)) % C
        // 2. 만약 S[i] % M = S[j] % M 라면, (S[i] - S[j]) % M = 0

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 배열의 요소는 최대 10의 9승까지 가능
        // 배열의 길이는 최대 10의 6승까지 가능
        // 따라서 누적 합이 10의 15승까지 저장될 수 있으므로 long 타입을 선언해야함
        long[] S = new long[N]; // 누적 합 배열 
        long[] C = new long[M]; // 누적 합의 나머지 조합을 구하기 위한 배열 (아이디어 2번)
        long answer = 0;

        // 누적합 계산
        S[0] = sc.nextInt();
        for (int i = 1; i < N; i++) {
            S[i] = S[i-1] + sc.nextInt();
        }

        // 나머지 계산하여 remainder 인덱스번호에 +1
        // 나머지가 0이면 answer++
        for (int i = 0; i < N; i++) {
            int remainder = (int) (S[i] % M);
            if (remainder == 0) answer++;
            C[remainder]++;
        }

        // 나머지의 조합 계산하여 answer에 추가
        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer += C[i] * (C[i] - 1) / 2;
            }
        }
        System.out.println(answer);
    }
}