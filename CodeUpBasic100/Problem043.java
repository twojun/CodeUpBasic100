package CodeUpBasic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem043 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        float f1 = Float.parseFloat(st.nextToken());
        float f2 = Float.parseFloat(st.nextToken());

        System.out.printf("%.3f", (f1/f2));
    }
}
