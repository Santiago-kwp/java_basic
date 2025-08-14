package java_advanced_01.day15.collection;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) { // 인스턴스의 동일여부를 name과 age 필드의 동일성 여부로 판별
            return target.name.equals(name) && (target.age == age);
        }
        return false;
    }
}
