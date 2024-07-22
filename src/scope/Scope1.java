package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작

        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료

        System.out.println("main m = " + m);
    } // m 생존 종료 (main 메소드 종료되면 프로그램 종료 / m은 프로그램 끝날때까지 살아있음)
}
