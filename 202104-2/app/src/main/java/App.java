import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class App {

    public static void main(String[] args) {

        int[][] A = new int[605][605];
        int res = 0;
        int[][] acc = new int[605][605];

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        // read L but not useful.
        scanner.nextInt();
        int r = scanner.nextInt();
        int t = scanner.nextInt();

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                A[i][j] = scanner.nextInt();
                acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1] + A[i][j];
            }
        }
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                int left = Math.max(j - r, 1);
                int right = Math.min(j + r, n);
                int upper = Math.max(i - r, 1);
                int down = Math.min(i + r, n);
                int near = acc[down][right] - acc[down][left - 1] - acc[upper - 1][right] + acc[upper - 1][left - 1];
                if (near <= (down - upper + 1) * (right - left + 1) * t) {
                    res++;
                }
            }
        }

        System.out.println(res);
    }
}
