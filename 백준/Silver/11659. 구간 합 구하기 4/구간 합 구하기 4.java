import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {

        int numNo = nextInt();
        int quizNo = nextInt();

        long[] S = new long[numNo + 1];
        for (int i = 1; i <= numNo; i++) {
            S[i] = S[i - 1] + nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < quizNo; i++) {
            int a = nextInt();
            int b = nextInt();
            sb.append(S[b] - S[a - 1]).append('\n');
        }

        System.out.print(sb);
    }
}