import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 몫 출력
        System.out.print(a / b + ".");
        
        // 소수점 출력
        a %= b;
        for(int i = 0; i < 20; i++) {
            a *= 10;
            System.out.print(a / b);
            a %= b;
        }
    }
}
