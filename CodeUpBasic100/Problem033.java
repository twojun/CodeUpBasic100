package CodeUpBasic100;

import java.io.*;
import java.util.StringTokenizer;

public class Problem033 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;

        while ((str = bufferedReader.readLine()) != null) {
            bufferedWriter.write(str + "\n");
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
