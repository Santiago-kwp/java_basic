package jungol.배열2;


import java.util.Scanner;

public class 연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%d번째 학생의 점수 ",i+1);
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int[] studentTotal = new int[3];
        int[] subjectTotal = new int[4];

        System.out.println("     국어 영어 수학 총점");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf(" %d번",i+1);
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%4d",arr1[i][j]);
                studentTotal[i] += arr1[i][j];
                subjectTotal[i] += arr1[j][i];
            }
            System.out.printf("%4d\n",studentTotal[i]);
            subjectTotal[3] += subjectTotal[i];
        }
        System.out.print("합계");
        for(int score : subjectTotal)
            System.out.printf("%4d",score);

    }
}
