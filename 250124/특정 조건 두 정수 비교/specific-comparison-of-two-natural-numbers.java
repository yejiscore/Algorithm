import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int aa = a < b ? 1 : 0;
        int bb = a == b ? 1 : 0;

        System.out.printf("%d %d", aa, bb);
    }
}