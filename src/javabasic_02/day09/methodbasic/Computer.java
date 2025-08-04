package javabasic_02.day09.methodbasic;

public class Computer {
    public int totalSum(int ... values){ // 가변길이 처리
        int total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }
}
