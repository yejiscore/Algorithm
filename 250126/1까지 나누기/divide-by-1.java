import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        // for문 안에서 n 값이 계속 변하므로 범위를 나타내는 진짜 n값을 따로 저장
        int n2 = n;

        for (int i = 1; i <= n2; i++) {
            cnt++;
            n /= i;
            if (n <= 1) {
                break;
            }
        }
        System.out.println(cnt);
    }
}