package jungol.배열2;

public class 연습문제4 {
    public static void main(String[] args) {
        int[][] arr = {{3,5,4}, {2,6,7}, {8,10,1}};
        for (int[] ints : arr) {
            for (int n : ints) {
                System.out.printf("%d ",n);
            }
            System.out.println();
        }

    }
}
