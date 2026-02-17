import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());
        
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(A);
        
        int cnt = 0;
        int start_index = 0;
        int end_index = n-1;
        
        while (start_index < end_index) {
            if (A[start_index] + A[end_index] > m) {
                end_index--;
            } else if (A[start_index] + A[end_index] < m) {
                start_index++;
            } else {
                cnt++;
                start_index++;
                end_index--;
            }
        }
        
        System.out.println(cnt);
        bf.close();
    }
}