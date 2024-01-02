package CodeUpBasic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Problem054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger sum  = new BigInteger("0");

        for (int i = 0; i < 3; i++) {
            int count = Integer.parseInt(br.readLine());
            for (int j = 0; j < count; j++) {
                BigInteger input  = new BigInteger(br.readLine());
                sum = sum.add(input);
            }

            if (sum.compareTo(BigInteger.ZERO) == -1) {
                System.out.println("-");
            } else if (sum.compareTo(BigInteger.ZERO) == 1) {
                System.out.println("+");
            } else {
                System.out.println(0);
            }
        }
    }
}
