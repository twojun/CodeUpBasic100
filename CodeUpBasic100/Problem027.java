package CodeUpBasic100;

import java.util.Scanner;

public class Problem027 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(Integer.toHexString(number));
        scanner.close();
    }
}
