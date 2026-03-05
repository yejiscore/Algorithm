import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean[] IsPrime = new boolean[10000001];
        for (int i = 2; i <= 10000000; i++) {
            IsPrime[i] = true;
        }
        
        // 소수 판별
        for (int i = 2; i < Math.sqrt(10000000); i++) {
            if (!IsPrime[i]) {
                continue;
            }
            for (int j = i+i; j <= 10000000; j += i) {
                IsPrime[j] = false;
            }
        }
        
        int i = n;
        // 팰린드롬인지 확인
        while (true) {
            if (IsPrime[i] && IsPalindrome(i)) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
    
    // 팰린드롬 판별
    public static boolean IsPalindrome(int target) {
        char temp[] = String.valueOf(target).toCharArray();
        
        int start = 0;
        int end = temp.length - 1;
            
        while (start < end) {
            if (temp[start] != temp[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}