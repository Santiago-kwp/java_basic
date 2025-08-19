package java_advanced_01.day17.anonymousClass.lambdaEx;

public class Main1 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello lambda");
            }
        };

        Runnable runnable1 = () -> System.out.println("hello");
    }
}
