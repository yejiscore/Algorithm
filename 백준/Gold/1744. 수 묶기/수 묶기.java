import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 개수
        
        // 차례대로 (2 이상의)양수(우선순위 내림차순 큐), 음수(우선순위 큐), 1, 0
        PriorityQueue<Integer> plusPq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();
        int one = 0;
        int zero = 0;
        
        // 입력하는 값들을 4가지로 분류(2 이상 양수, 음수, 1, 0)
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > 1) {
                plusPq.add(num);
            } else if (num < 0) {
                minusPq.add(num);
            } else if (num == 1) {
                one++;
            } else {
                zero++;
            }
        }
        
        int sum = 0;
        
        // 양수 (두 수 곱하기)
        while (plusPq.size() > 1) {
            int first = plusPq.remove();
            int second = plusPq.remove();
            sum += first * second;
        }
        // 양수가 홀수개라면 남은 양수는 그냥 더하기
        if (!plusPq.isEmpty()) {
            sum += plusPq.remove();
        }
        
        // 음수 (두 수 곱하기)
        while (minusPq.size() > 1) {
            int first = minusPq.remove();
            int second = minusPq.remove();
            sum += first * second;
        }
        // 음수가 홀수개라면 0이 있는지 확인
        // 있다면 0과 곱하기 = 즉 아무것도 안 해도 됨
        // 없다면 그냥 더하기
        if (!minusPq.isEmpty()) {
            if (zero == 0) {
                sum += minusPq.remove();
            }
        }
        
        // 1 더하기
        sum += one;
        
        // 0은 아무것도 안 해도 됨
        
        System.out.println(sum);
    }
}