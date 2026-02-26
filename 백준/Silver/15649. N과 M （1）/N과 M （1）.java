import java.util.Scanner;

public class Main {

    static int n, m;
    static boolean[] visited;
    static int[] selected;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        visited = new boolean[n + 1];
        selected = new int[m];

        backtracking(0);
    }

    private static void backtracking(int depth) {

        if (depth == m) {
            print();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[depth] = i;
                backtracking(depth + 1);
                visited[i] = false;
            }
        }
    }

    private static void print() {
        for (int i = 0; i < m; i++) {
            System.out.print(selected[i] + " ");
        }
        System.out.println();
    }
}