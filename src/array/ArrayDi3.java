package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
//        int[][] arr = new int[][]{
//            {1,2,3},
//            {4,5,6}
//        };
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        };

        // 중첩 for문
        for(int row = 0; row < arr.length; row++) { // arr.length 는 행의 개수
            for(int col = 0; col < arr[row].length; col++) { // arr[row].length 는 열의 개수
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
