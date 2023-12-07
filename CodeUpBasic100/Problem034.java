package CodeUpBasic100;

import java.io.*;
import java.util.StringTokenizer;

public class Problem034 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int number1 = Integer.parseInt(stringTokenizer.nextToken());
        int number2 = Integer.parseInt(stringTokenizer.nextToken());

        bufferedWriter.write((number1 - number2) + " ");

        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
