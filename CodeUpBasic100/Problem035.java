package CodeUpBasic100;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem035 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        double d1 = Double.parseDouble(st.nextToken());
        double d2 = Double.parseDouble(st.nextToken());

        System.out.println(d1 * d2);
    }
}
