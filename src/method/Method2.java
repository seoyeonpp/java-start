package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 작동중입니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("프로그램을 시작합니다 =");
        return; // 메서드는 return을 무조건 생략해야한다. void의 경우일땐 자바파일이 알아서 넣어줘서 생략해도 되지만 그래도 넣는게좋음
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다");
        return;
    }
}
