import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
      String str = br.readLine(); 
      // 굳이 String 변수 생성하지 않아도 됨 (삭제 가능)
      StringTokenizer st = new StringTokenizer(str," ");
      int A = Integer.parseInt(st.nextToken());
      int B = Integer.parseInt(st.nextToken());

      System.out.println((A>B) ? ">" : ((A<B) ? "<" : "=="));
  }
}