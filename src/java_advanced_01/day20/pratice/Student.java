package java_advanced_01.day20.pratice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Builder
@Getter
@AllArgsConstructor
public class Student implements Comparable<Student>, Serializable {
    String name;
    int age;
    double grade;

    @Override
    public String toString() {
        return this.name + ", " + this.age + "세";
    }

    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
    }
}
