package CodeUpBasic100;

import java.util.Scanner;

public class ScannerNextLineExample001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");

        for (int i = 0; i < strArr.length; i++) {
            System.out.println("strArr[" + i +"] :" + strArr[i]);
            for (int j = 0; j < strArr[i].length(); j++) {
                System.out.println(strArr[i].charAt(j));
            }
            System.out.println("strArr[" + i +"] length : " + strArr[i].length());
            System.out.println();
        }
    }
}
