import java.util.*;

public class Main {
    
    static int n;
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        
        // 일의 자리 소수는 2 3 5 7 뿐이므로 4개만 시작
        // 탐색 1번을 줄이기 위함.
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }
    
    static void DFS(int number, int jarisu) {
        if (jarisu == n) {
            if (isPrime(number)) {
              System.out.println(number);
            }
            return;
        }
        
        for (int i = 1; i < 10; i++) {
            // 짝수면 굳이 할 필요없음
            if (i % 2 == 0) continue;
            
            // 소수면 자릿수 추가하여 재귀
            if (isPrime(number * 10 + i)) DFS(number * 10 + i, jarisu + 1);
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}