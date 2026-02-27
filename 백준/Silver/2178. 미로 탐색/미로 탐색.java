import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    // 상, 하, 좌, 우
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static boolean[][] visited;
    static int[][] A;
    static int N, M;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        A = new int[N][M];
        visited = new boolean[N][M];

        // 미로 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                A[i][j] = line.charAt(j) - '0';  // 문자열을 숫자로 변환
            }
        }

        BFS(0, 0);

        // 도착 지점의 최소 거리 출력
        System.out.println(A[N - 1][M - 1]);
    }

    public static void BFS(int x, int y) {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!queue.isEmpty()) {

            int[] now = queue.poll();

            for (int k = 0; k < 4; k++) {

                int nx = now[0] + dx[k];
                int ny = now[1] + dy[k];

                // 범위 체크
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {

                    // 방문 안 했으면
                    if (A[nx][ny] == 1 && !visited[nx][ny]) {

                        visited[nx][ny] = true;

                        // 거리 추가
                        A[nx][ny] = A[now[0]][now[1]] + 1;

                        queue.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}