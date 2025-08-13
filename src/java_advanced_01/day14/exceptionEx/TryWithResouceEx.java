package java_advanced_01.day14.exceptionEx;

public class TryWithResouceEx {
    public static void main(String[] args) {
        try(MyResource resource = new MyResource("AAA")) {
            String data = resource.read1();
            int value = Integer.parseInt(data);
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("예외처리: "+e.getMessage());
        }

        try(MyResource resource = new MyResource("AAA")) {
            String data = resource.read2();
            int value = Integer.parseInt(data);
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("예외처리: "+e.getMessage());
        }

        MyResource resource1 = new MyResource("BBB");
        MyResource resource2 = new MyResource("CCC");
        try(resource1;resource2) {
            String data1 = resource1.read1();
            String data2 = resource2.read2();
        } catch(Exception e) {
            System.out.println("예외 처리 : " + e.getMessage());
        }

    }
}
