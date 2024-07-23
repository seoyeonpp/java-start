package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProduct = 10; // array list라는 자료구조를 사용하면 유연하게 사용할 수 있음
        String[] productNames = new String[maxProduct];
        int[] productPrices = new int[maxProduct];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int menu = scanner.nextInt(); // 10 엔터를 치면 \n 이 들어가버림
            scanner.nextLine(); // 엔터를 제거하기 위해 추가

            if(menu == 1) {

                if(productCount >= maxProduct) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue; // 다시 while 문으로 돌아감
                }

                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for(int i = 0; i<productCount; i++) {
                    System.out.println(productNames[i] + ":" + productPrices[i]+ "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }
    }
}
