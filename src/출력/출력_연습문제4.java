package jungol;

public class 출력_연습문제4 {
    public static void main(String[] args) {
        int front, blank;
        for (int i=1; i<8; i++) {
            // 앞 빈칸 세기 3 > 2 > 1 > 0 > 1 > 2 > 3 이 되는 순서로 구현하기
            front = Math.abs(4 - Math.abs(i));
            for(int j=0;j<front;j++) System.out.print(' ');
            System.out.print('@');
            // 가운데 공백 세기 0 > 2 > 4 > 6 > 4 > 2 > 0 이 되는 순서로 구현하기
            blank = 6 - 2*front;
            for(int k=0;k<blank;k++) System.out.print(' ');
            System.out.println('@');
        }
    }
}
