package java_advanced_01.day17.anonymousClass.class03;

class Animal {
    public String eat() {
        return "맛있게 먹습니다.";
    }
}
public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public String eat() {
                System.out.println(run()); // 가능
                return "강아지 멍멍";
            }
            public String run() {
                return "강아지가 뛴다.";
            }
        };

        dog.eat(); // 가능
//        dog.run(); // 불가능
    }

}
