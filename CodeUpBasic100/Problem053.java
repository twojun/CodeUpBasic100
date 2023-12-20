package CodeUpBasic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem053 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int booleanNumber = Integer.parseInt(br.readLine());

        if (booleanNumber == 1) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        br.close();
    }
}
