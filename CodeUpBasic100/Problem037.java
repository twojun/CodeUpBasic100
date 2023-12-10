package CodeUpBasic100;

import java.io.IOException;
import java.util.Scanner;

public class Problem037 {

    public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

            int count = scanner.nextInt();
            scanner.nextLine();
            String str = scanner.nextLine();

            for (int i = 0; i < count; i++) {
                System.out.printf(str);
            }

    }
}
