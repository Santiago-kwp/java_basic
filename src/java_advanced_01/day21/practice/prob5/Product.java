package java_advanced_01.day21.practice.prob5;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Product implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;

    private String name;
    private int price;

}
