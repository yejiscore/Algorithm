import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        int coin_cnt = 0;
        
        for (int i = n-1; i >= 0; i--) {
            if (k >= A[i]){
                coin_cnt += k / A[i];
                k = k % A[i];
            }
        }
        System.out.println(coin_cnt);
    }
}