import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println(n);
            System.out.println("minus");
        } else {
            System.out.println(n);
        }
    }
}