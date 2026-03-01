import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int checkArr[]; // A, C, G, T 각각 최소로 필요한 개수 저장
    static int myArr[]; // 현재 슬라이딩 윈도우 안에 있는 A, C, G, T 개수 저장
    static int checkSecret; // 최소 개수 조건을 만족한 문자 종류 개수 (즉, 4면 성공)
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int S = Integer.parseInt(st.nextToken()); // 전체 DNA 문자열 길이
        int P = Integer.parseInt(st.nextToken()); // 검사할 부분 문자열 길이
        
        int Result = 0; // 조건을 만족하는 비밀번호 개수
        char A[] = new char[S]; // 전체 DNA 문자열 저장
        
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;
        
        A = bf.readLine().toCharArray(); // DNA 문자열 입력받기
        
        // A,C,G,T 의 각각 최소 필요 개수 입력
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            
            // 만약 최소 필요 개수가 0이면 이미 조건을 만족한 상태이므로 미리 checkSecret 증가
            if (checkArr[i] == 0)
                checkSecret++;
        }
        
        // 초기 슬라이딩 윈도우 세팅
        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }
        
        // 모두 만족했을 때
        if (checkSecret == 4)
            Result++;
        
        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4)
                Result++;
        }
        
        System.out.println(Result);
        bf.close();
    }
    
    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0])
                    checkSecret++;
                break;
            
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1])
                    checkSecret++;
                break;
            
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2])
                    checkSecret++;
                break;
            
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3])
                    checkSecret++;
                break;
        }
    }
    
    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0])
                    checkSecret--;
                myArr[0]--;
                break;
                
            case 'C':
                if (myArr[1] == checkArr[1])
                    checkSecret--;
                myArr[1]--;
                break;
            
            case 'G':
                if (myArr[2] == checkArr[2])
                    checkSecret--;
                myArr[2]--;
                break;
            
            case 'T':
                if (myArr[3] == checkArr[3])
                    checkSecret--;
                myArr[3]--;
                break;
        }
    }
}