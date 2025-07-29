package jungol.배열1;


import java.util.Scanner;

public class 자가진단9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr =  {95, 75, 85, 100, 50};
        int temp = 0;

        // 버블 정렬 구현
        for (int j = 1; j < 5; j++) {
            for (int k = j; k > 0; k--) {

                if (arr[k-1] > arr[k]) {
                    temp = arr[k-1];
                    arr[k-1] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        for (int e : arr) System.out.printf("%d ",e);

    }
}
