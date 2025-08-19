package java_advanced_01.day17.morningEx;

public class User implements Comparable<User>{
    private String name;
    private int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User u) {
        return -(this.age - u.age);
    }
}
