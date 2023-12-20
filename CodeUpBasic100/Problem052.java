package CodeUpBasic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        if (number == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        br.close();
    }
}
