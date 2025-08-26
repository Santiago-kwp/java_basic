package java_advanced_01.day21.practice.prob2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Serializable {
    @Serial
    private static final long serialVersionUID = 42L;
    private String title;
    private int price;

}
