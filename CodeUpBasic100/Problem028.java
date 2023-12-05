package CodeUpBasic100;

import java.util.Scanner;

public class Problem028 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String hexDecimal = Integer.toHexString(number)
                .toUpperCase();

        System.out.println(hexDecimal);
        scanner.close();

    }
}
