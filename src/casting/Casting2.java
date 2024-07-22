package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 명시적 형변환 (큰 범위에서 작은 범위 대입)
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류
        intValue = (int) doubleValue; // 명시적 형변환
        System.out.println("intValue = " + intValue); // int는 정수이기때문에 소수점 버린다.
    }
}
