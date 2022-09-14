import java.util.ArrayList;
import java.util.Scanner;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<int[]> listA = new ArrayList<>();
        ArrayList<int[]> listB = new ArrayList<>();

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] res = new String[m];

        for (int i = 0; i < n; i++) {
            int[] xy = new int[] {
                    scanner.nextInt(),
                    scanner.nextInt()
            };
            String str = scanner.next();
            if (str.equals("A")) {
                listA.add(xy);
            } else {
                listB.add(xy);
            }
        }

        int a = listA.size();
        int b = listB.size();

        for (int i = 0; i < m; i++) {
            int a0 = scanner.nextInt();
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int A = 0, B = 0;

            for (int j = 0; j < a; j++) {
                int sum = a0 + a1 * listA.get(j)[0] + a2 * listA.get(j)[1];
                if (sum > 0) {
                    A++;
                }
            }

            for (int j = 0; j < b; j++) {
                int sum = a0 + a1 * listB.get(j)[0] + a2 * listB.get(j)[1];
                if (sum > 0) {
                    B++;
                }
            }

            if((A==0 && B==b) || (A==a && B==0)) {
                res[i] = "Yes";
            } else {
                res[i] = "No";
            }
        }

        for (int i=0;i<m;i++) {
            System.out.println(res[i]);
        }
    }
}