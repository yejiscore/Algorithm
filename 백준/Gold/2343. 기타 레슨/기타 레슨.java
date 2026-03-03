import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 레슨 수
        int m = sc.nextInt(); // 블루레이 수
        int[] A = new int[n]; // 입력할 레슨 저장할 배열
        
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            
            // 가장 긴 레슨 찾아서 start로 정하기
            if (start < A[i]) {
                start = A[i];
            }
            
            // 모든 레슨의 시간 합을 end로 정하기
            end += A[i];
        }
        
        // 이진탐색
        while (start <= end) {
            
            int mid = (start + end) / 2; // 블루레이에 담을 용량
            int sum = 0;
            int bluray_cnt = 0;
            
            for (int i = 0; i < n; i++) {
                
                // 넘치면 새 블루레이 추가
                if (sum + A[i] > mid) {
                    bluray_cnt++;
                    sum = 0;
                }
                sum += A[i];
            }
            
            // 마지막 블루레이도 갯수 세기
            if (sum !=0) bluray_cnt++;
            
            // 필요한 블루레이 수가 M보다 많다 → 용량이 부족하니 늘리기
            // M 이하로 가능 → 더 줄여볼 수 있으니 줄이기
            if (bluray_cnt > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(start);
    }
}