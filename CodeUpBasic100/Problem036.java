package CodeUpBasic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem036 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        String words = st.nextToken();
        int count = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count; i++) {
            System.out.printf(words);
        }


    }
}
