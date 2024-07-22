package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("숫자를 입력하세요. 종료하고싶으면 0 입력 : ");
            int num = scanner.nextInt();

            if(num == 0) {
                break;
            }

            sum += num;
            System.out.println("현재까지 합은 " + sum + "입니다.");
        }

        System.out.println("시스템을 종료합니다. 총합 : " + sum);
    }
}
