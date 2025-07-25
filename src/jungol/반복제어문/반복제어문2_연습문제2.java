package jungol.반복제어문;

public class 반복제어문2_연습문제2 {
    public static void main(String[] args) {
        for(int i=0;i<26;i++) System.out.printf("%c",65+i);
        int sum = 0;
        for(int i=1;i<=100;i++) sum+=i;
        System.out.println(sum);
        System.out.printf("과목명: %3$s 이름: %2$s 학번: %3$s\n","자바","서유미","1234");
    }
}
