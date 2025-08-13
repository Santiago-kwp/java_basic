package java_advanced_01.day14.exceptionEx;

public class MyResource implements AutoCloseable{

    private String name;

    MyResource(String name) {
        this.name = name;
        System.out.println("[MyResouce(" + name + ") 열기");
    }

    public String read1() {
        System.out.println("[MyResouce(" + name + ") 읽기");
        return "100";
    }

    public String read2() {
        System.out.println("[MyResouce(" + name + ") 읽기");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[MyResouce(" + name + ") 닫기");
    }
}
