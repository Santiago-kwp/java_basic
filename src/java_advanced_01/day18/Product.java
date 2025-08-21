package java_advanced_01.day18;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Product {
    private String no;
    private String name;
    private String company;
    private int price;

}
