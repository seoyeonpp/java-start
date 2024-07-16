package operator;

public class Comp2 {
    public static void main(String[] args) {
        // 문자열 비교는 .equals 를 사용해야한다. == 이 성공할때도 있고 실패할때도 있음.

        String str1 = "Hello1";
        String str2 = "Hello2";

        boolean result1 = str1.equals(str2);
        System.out.println(result1);
        System.out.println(str1.equals("Hello1"));
    }
}
