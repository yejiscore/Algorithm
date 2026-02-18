import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] answer = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        // 기본값 -1 세팅
        Arrays.fill(answer, -1);
        
        Stack<Integer> stack = new Stack<>();
        
        // 오큰수 계산
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] < a[i]) {
                answer[stack.pop()] = a[i];
            }
            stack.push(i);
        }
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(answer[i]).append(" ");
        }
        
        System.out.println(sb);
    }
}