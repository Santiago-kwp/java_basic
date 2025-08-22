package java_advanced_01.day19.test;

class Person{
    private Phone phoneNumber;  //객체 생성시 초기화
    private String name;

    Person(String name){ this.name=name;    }

    public Phone getPhone() {
        return this.phoneNumber;}
}


class Phone{
    private OS os;

    public OS getOs() {
        return this.os;
    }
}

class OS {
    public String printOS(){
        return "IOS";
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        person.getPhone().getOs().printOS();
    }
}
/*
Person person = new Person("홍길동");
Person p = new Person("홍미자");

Phone ph = p.getPhoneNumber();

        if (ph != null) {
OS os = ph.getOS();
        if (os == null) {
String osName = System.getProperty("os.name").toLowerCase();
        }
                }
                // Optional 클래스 NPE 처리 => Null을 처리하기 위한 랩퍼(Wrapper) 클래스
                Optional.ofNullable(p1).map(Person::getPhoneNumber).map(Phone::getOS).map(OS::)

 */
