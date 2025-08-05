package javabasic_02.day10.mornigtest;

public class SingleTone {

    // 싱글톤 클래스 객체를 담을 인스턴스 변수 ~ 하나만 만들어서 재활용하겠다.
    private static SingleTone instance;

    // 생성자를 private 선언 : 외부에서 인스턴스 생성 방지(new 연산자X)
    private SingleTone(){};

    public static SingleTone getInstance() {
        if(instance == null){
            instance = new SingleTone();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTone s1 = SingleTone.getInstance();
        SingleTone s2 = SingleTone.getInstance();
        SingleTone s3 = SingleTone.getInstance();

        // 아래 결과는 다 같음. 즉, 같은 객체를 가리킴
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

    }

}
