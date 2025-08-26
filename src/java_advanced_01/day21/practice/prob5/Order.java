package java_advanced_01.day21.practice.prob5;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@ToString
public class Order implements Serializable {
    @Serial
    private static final long serialVersionUID = 22L;

    private int orderId;
    private Product product;

}
