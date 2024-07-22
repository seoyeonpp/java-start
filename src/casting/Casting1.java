package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 묵시적 형변환 (자동 형변환) - 작은 범위에서 큰 범위 대입
        int intValue = 10;
        long longValue;
        double doubleValue; // 부동소수점을 사용하기때문에 더 큰 숫자범위를 표현한다.

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue = " + doubleValue);
    }
}
