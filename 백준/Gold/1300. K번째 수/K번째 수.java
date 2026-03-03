import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        long start = 1, end = k;
        long result = 0;
        
        while (start <= end) {
            long mid = (start + end) / 2; 
            long cnt = 0;
            
            // 중간 값보다 작은 수는 몇 개인지 계산
            // i번째 행은 i의 배수이므로
            // 즉 i번째 행에서 mid 이하의 개수는 mid를 i로 나눈 값
            // 단, 한 행에는 최대 N개만 있으므로 Math.min(mid / i, N) 더한다
            for (int i = 1; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }
            
            // cnt가 k보다 작으면
            // mid는 작으니 start 를 middle + 1로 증가
            // cnt가 k 이상이면
            // middle은 K번째 수가 될 가능성이 있으므로
            // 우선 result에 저장
            // 그리고 더 작은 값이 있는지 확인하기 위해 end를 middle - 1로 감소
            if (cnt < k) {
                start = mid + 1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
}