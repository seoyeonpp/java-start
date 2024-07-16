package variable;

public class Var3 {
    public static void main(String[] args) {
//        개발자가 직접 적은 고정된 값을 리터럴 (literal)이라고 함.
        int a = 100; // 정수, 마이너스도 됨 (정수 리터럴)
        double b = 10.5; // 실수, 마이너스도 됨 (실수 리터럴)
        boolean c = true; // 논리 (불리언 리터럴) 1byte
        char d = 'A'; // 문자 하나, 작은따옴표로 감싼다. (문자 하나 리터럴) 1byte
        String e = "Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입, 큰따옴표로 감싼다 (문자열 리터럴)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
