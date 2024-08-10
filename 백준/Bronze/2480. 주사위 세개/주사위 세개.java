import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
    
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		// 모두 같은 경우
		if (a == b && b == c) {
			System.out.println(10000 + a * 1000);
		}

		// 모두 다른 경우
		else if (a != b && b != c && a != c) {
			int max = Math.max(a, Math.max(b, c));
			System.out.println(max * 100);
		}

		// a, b만 같은 경우 혹은 b, c만 같은 경우
		else if (a == b || b == c) {
			System.out.println(1000 + b * 100);
		}

		// a, c만 같은 경우
		else {
			System.out.println(1000 + a * 100);
		}
	}
}