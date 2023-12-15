package CodeUpBasic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem044 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.printf("%.0f\n", (float) (a / b));
        System.out.printf("%.2f\n", (float) (a % b));
        System.out.printf("%.2f\n", (float) (a / b));

    }
}
