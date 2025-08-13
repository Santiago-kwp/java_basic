package java_advanced_01.day14.exceptionEx;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        // 1. 정상 실행 케이스
        try (MyResource resource = new MyResource("AAA")) {
            String data = resource.read1();
            int value = Integer.parseInt(data);
            System.out.println("결과: " + value);
        } catch (Exception e) {
            System.out.println("예외처리: " + e.getMessage());
        }
        // 출력:
        // [MyResource(AAA) 열기]
        // [MyResource(AAA) 읽기]
        // 결과: 100
        // [MyResource(AAA) 닫기]

        System.out.println("===================");

        // 2. 예외 발생 케이스
        try (MyResource resource = new MyResource("BBB")) {
            String data = resource.read2();
            int value = Integer.parseInt(data); // NumberFormatException 발생!
            System.out.println("결과: " + value);
        } catch (Exception e) {
            System.out.println("예외처리: " + e.getMessage());
        }
        // 출력:
        // [MyResource(BBB) 열기]
        // [MyResource(BBB) 읽기]
        // [MyResource(BBB) 닫기]  <- 예외 발생 후에도 자동으로 닫힘!
        // 예외처리: For input string: "abc"

        System.out.println("===================");

        // 3. 다중 리소스 처리
        MyResource resource1 = new MyResource("CCC");
        MyResource resource2 = new MyResource("DDD");

        try (resource1; resource2) {
            String data1 = resource1.read1();
            String data2 = resource2.read1();
            System.out.println("결과1: " + data1 + ", 결과2: " + data2);
        } catch (Exception e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
        // 출력:
        // [MyResource(CCC) 열기]
        // [MyResource(DDD) 열기]
        // [MyResource(CCC) 읽기]
        // [MyResource(DDD) 읽기]
        // 결과1: 100, 결과2: 100
        // [MyResource(DDD) 닫기]  <- 나중에 생성된 것부터 먼저 닫힘
        // [MyResource(CCC) 닫기]
    }
}
