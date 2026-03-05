import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] A = new int[N][2];

        for (int i = 0; i < N; i++) {
            A[i][0] = sc.nextInt(); // 시작시간
            A[i][1] = sc.nextInt(); // 종료시간
        }

        // 람다식 정렬
        Arrays.sort(A, (a, b) -> { // A 라는 배열을 정렬할건데, 해당 배열의 원소 두 개 a, b를 비교할 것이다.
            if (a[1] == b[1]) { // 종료시간이 같다면
                return a[0] - b[0]; // 시작시간이 빠른 순으로 
            }
            return a[1] - b[1]; // (기본값) 종료시간이 빠른 순으로
        });

        int count = 0;
        int end = 0;

        for (int i = 0; i < N; i++) {
            // 앞서 회의가 끝나고 뒤에 이어서 겹치지 않게 회의가 시작되는 경우가 있다면
            if (A[i][0] >= end) {
                // 해당 회의 진행 후 종료 시간 업데이트
                end = A[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}