package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a++;
        System.out.println(a);

        // 후위 연산자
        int b = a++;
        System.out.println(b);
        System.out.println(a);

        // 전위 연산자
        int c = ++b;
        System.out.println(c);
    }
}
