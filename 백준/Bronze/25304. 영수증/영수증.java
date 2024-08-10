import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int price = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());

		int answer = 0;

		for (int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			answer += a * b;
		}
    
		if (answer == price) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}