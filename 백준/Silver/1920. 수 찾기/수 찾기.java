import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        // 데이터 개수
        int n = sc.nextInt();
        
        // 데이터 입력
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        // 데이터 정렬
        Arrays.sort(A);
        
        // 찾아야 하는 숫자 개수
        int m = sc.nextInt();
        
        // 찾아야 하는 숫자 이진탐색
        for (int i = 0; i < m; i++) {
            boolean find = false;
            int target = sc.nextInt();
            
            // 시작, 끝 인덱스 설정
            int start = 0;
            int end = A.length - 1;
            
            while (start <= end) {
                int mid_index = (start + end) / 2;
                int mid_value = A[mid_index];
                
                if (mid_value > target) {
                    end = mid_index - 1;
                } else if (mid_value < target) {
                    start = mid_index + 1;
                } else {
                    // target 찾았으면 끝
                    find = true;
                    break;
                }
            }
            
            // 데이터에 찾아야하는 숫자가 있다면 1 출력 
            // 없다면 0 출력
            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}