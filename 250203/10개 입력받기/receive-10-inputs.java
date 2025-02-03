import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int cnt = 0;
        int a[] = new int[10];
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                sum += n;
                cnt++;
            }
        }

        double avg = sum / cnt;

        System.out.printf("%d %.1f", (int)sum, avg);
    }
}