import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int cnt = 0;
        
        long A[] = new long[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        
        Arrays.sort(A);
        
        for (int targetIndex = 0; targetIndex < n; targetIndex++) {
            long targetValue = A[targetIndex];
            int i = 0;
            int j = n - 1;
        
            while (i < j) {
                if (A[i] + A[j] == targetValue) {
                
                    // 자기 자신을 사용하지 않았는지 확인
                    if (i != targetIndex && j != targetIndex) {
                        cnt++;
                        break;
                    } else if (i == targetIndex) {
                        i++;
                    } else if (j == targetIndex) {
                        j--;
                    }
                } else if (A[i] + A[j] < targetValue) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        System.out.println(cnt);
        bf.close();
    }
}