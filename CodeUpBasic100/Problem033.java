package CodeUpBasic100;

import java.util.Scanner;

public class Problem033 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        char nextChar = (char) (c + 1);
        System.out.println(nextChar);
    }
}
