package javabasic_01.day07;

import java.util.Scanner;

public class DoubleArrayEx01 {

    public static void main(String[] args) {

        // 학생 3명의 국어, 영어, 수학 점수를 관리하는 이차원 배열을 만드시오
        int[][] scores = new int[3][3];

        // 1번 학생의 국어 : 90, 영어 : 50, 수학 : 80 점을 저장하세요.
        scores[0][0] = 90;
        scores[0][1] = 50;
        scores[0][2] = 80;

        // 2번 학생의 국어, 영어, 수학 점수를 저장하세요.
        scores[1][0] = 80;
        scores[1][1] = 76;
        scores[1][2] = 89;

        // 3번 학생의 국어, 영어, 수학 점수를 저장하세요.
        scores[2][0] = 100;
        scores[2][1] = 20;
        scores[2][2] = 65;

        // 각 학생들의 국어, 영어, 수학 점수를 입력 받으시오.
        Scanner input = new Scanner(System.in);
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++) {

            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%d번 학생의 %s 점수를 입력하시오 : ", i+1, subjects[j]);
                scores[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // 각 학생들의 국어, 영어, 수학 점수와 총점과 평균을 학생별로 출력하세요.
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total = 0;
            System.out.printf("%d번 학생의 국어, 영어, 수학 점수는 : ",i+1);
            for (int j = 0; j < scores[i].length; j++) {
                System.out.printf("%d, ", scores[i][j]);
                total += scores[i][j];
            }
            System.out.println();
            System.out.printf("%d번 학생의 총점 : %d, 평균 : %.1f", i+1, total, (double)total/scores.length);
            System.out.println();
        }
    }
}
