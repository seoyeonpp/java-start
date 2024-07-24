package method;

public class Method1Ref {
    public static void main(String[] args) {
        // ㄱㅖ산1
        int sum1 = add(1,2);
        System.out.println("결과: " + sum1);

        System.out.println("=============");

        // ㄱㅖ산2
        int sum2 = add(10,20);
        System.out.println("결과: " + sum2);
    }

    // 메서드 정의
    // static 뒤에있는 int는 반환값의 타입이다. 반환값이 없으면 void
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + "=" + "연산 수행");
        int sum = a + b;
        return sum;
    }
}
