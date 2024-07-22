package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5]; // 5개의 그릇

        // System.out.println(students); // 배열의 주소값 출력 ex) I@a09ee92 - I는 int형
        // 변수는 배열의 위치만 가지고있음.
        // 변수에는 기본형과 참조형이 있음. 참조형은 크기를 동적으로 늘릴 수 있음.

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
