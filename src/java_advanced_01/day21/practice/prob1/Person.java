package java_advanced_01.day21.practice.prob1;



import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;
    private String name;
    private transient int age;




}
