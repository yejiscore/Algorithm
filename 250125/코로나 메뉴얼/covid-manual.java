import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        
        String a1 = sc.next();
        int aa1 = sc.nextInt();
        if (a1.equals("Y") && aa1 >= 37) {
            cnt++;
        }
        
        String b2 = sc.next();
        int bb2 = sc.nextInt();
        if (b2.equals("Y") && bb2 >= 37) {
            cnt++;
        }
        
        String c3 = sc.next();
        int cc3 = sc.nextInt();
        if (c3.equals("Y") && cc3 >= 37) {
            cnt++;
        }
        
        if (cnt >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}
