import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            n /= i;
            cnt++;
            if (n < 1) {
                cnt++;
                break;
            }
        }
        System.out.println(cnt);
    }
}