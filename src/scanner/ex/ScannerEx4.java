package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("구구단의 단 수를 입력해주세요. : ");
        int n = scanner.nextInt();

        for(int i = 1; i< 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}
