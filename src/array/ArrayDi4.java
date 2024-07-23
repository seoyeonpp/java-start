package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];

        // 값 넣기
        int i = 1;
        for (int row = 0; row < arr.length; row ++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }


        // 값 출력
        for(int row = 0; row < arr.length; row++) { // arr.length 는 행의 개수
            for(int col = 0; col < arr[row].length; col++) { // arr[row].length 는 열의 개수
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
