import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
 
public class Main {
 
    public static void main(String[] args) throws IOException {  
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        
        String[] str = br.readLine().split(" ");  
        // 입력받은 한 줄의 문자열을 공백(" ") 기준으로 나눠서 배열로 저장
        
        int a = Integer.parseInt(str[0]);  
        // 배열의 첫 번째 요소를 정수(int)로 변환
        int b = Integer.parseInt(str[1]);  
        // 배열의 두 번째 요소를 정수(int)로 변환
        
        System.out.println(a + b); 
        
    }
 
}