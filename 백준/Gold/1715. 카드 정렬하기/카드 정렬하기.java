import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int card = sc.nextInt();
            pq.add(card);
        }
        
        int card1 = 0;
        int card2 = 0;
        int sum = 0;
        
        while (pq.size() != 1) {
            card1 = pq.poll();
            card2 = pq.poll();
            sum += card1 + card2;
            pq.add(card1 + card2);
        }
        System.out.println(sum);
    }
}