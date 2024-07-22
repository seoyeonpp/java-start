package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50}; // 자바가 int 배열인것을 추론함. new int[] 생략가능, 배열 생성과 초기화 동시에할때만 쓸수있음. 줄바꿈하면 안됨

        for(int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
