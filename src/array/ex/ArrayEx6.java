package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자 개수를 입력하세용 :");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요. 입력 후 enter : ");

        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 초기화
        minNumber = numbers[0];
        maxNumber = numbers[0];

        for(int i = 1; i < n; i++) {
            if(minNumber > numbers[i]) {
                minNumber = numbers[i];
            }

            if(maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 큰 수는 " + maxNumber + "이고, 가장 작은 수는 " + minNumber + "입니다.");

    }
}
