import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int i = 1;

        while (i <= n) {
            if (i % 100 == 0) {
                if (i % 400 == 0) {
                    cnt += 1;
                }
            } else {
                if (i % 4 == 0) {
                    cnt += 1;
                }
            }
            i++;
        }
        System.out.print(cnt);
    }
}