package java_advanced_01.day17.anonymousClass.lambdaEx.lambda01;

// 함수형 인터페이스임을 보장(선택사항)
@FunctionalInterface
public interface Calculable {
    // 추상메소드
    void calculate(int num1, int num2);
}
