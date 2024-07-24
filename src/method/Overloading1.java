package method;

public class Overloading1 {
    public static void main(String[] args) {
        System.out.println("1번"+add(1, 2));
        System.out.println("2번"+add(1, 2,3));
        System.out.println("3번"+add(1.0, 2.5,3.6));
    }


    // 메소드 오버로딩
    public static int add(int a, int b) {
        System.out.println("1번호출");
        return a+b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번호출");
        return a+b+c;
    }

    public static double add(double a, double b, double c) {
        System.out.println("2번호출");
        return a+b+c;
    }
}
