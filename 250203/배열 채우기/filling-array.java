import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                a[i] = n;
            }
        }

        for (int i = 9; i >= 0; i--) {
            if (a[i] == 0) {
                continue;
            } else {
                System.out.print(a[i] + " ");
            }
        }
    }
}