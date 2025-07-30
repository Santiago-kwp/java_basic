package jungol.배열2;

public class 형성평가4 {
    public static void main(String[] args) {

        int[][] arr = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
                total += arr[i][j];
            }
            System.out.println();
        }
        System.out.println(total);
    }
}
