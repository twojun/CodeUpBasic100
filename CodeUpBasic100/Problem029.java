package CodeUpBasic100;

import java.util.Scanner;

public class Problem029 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        Integer result = Integer.valueOf(string, 16);

        System.out.println(Integer.toOctalString(result));
    }
}
