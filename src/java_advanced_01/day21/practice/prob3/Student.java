package java_advanced_01.day21.practice.prob3;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;
    private String name;
    private int grade;

}
