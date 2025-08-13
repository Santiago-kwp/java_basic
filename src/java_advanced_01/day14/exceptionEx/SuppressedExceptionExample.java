package java_advanced_01.day14.exceptionEx;

class ProblematicResource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new RuntimeException("close() 메서드에서 예외 발생!");
    }

    public void doSomething() {
        throw new RuntimeException("비즈니스 로직에서 예외 발생!");
    }
}

public class SuppressedExceptionExample {
    public static void main(String[] args) {
        try (ProblematicResource resource = new ProblematicResource()) {
            resource.doSomething(); // 첫 번째 예외 발생
        } catch (Exception e) {
            System.out.println("주 예외: " + e.getMessage());

            // 억제된 예외들 확인
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                System.out.println("억제된 예외: " + t.getMessage());
            }
        }
    }
}
