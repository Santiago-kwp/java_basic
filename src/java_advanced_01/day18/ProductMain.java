package java_advanced_01.day18;

import java.util.List;
import java.util.ArrayList;


public class ProductMain {
    public static void main(String[] args) {
        // List<Product> ArrayList products 생성
        List<Product> productList = new ArrayList<>();

        // 5개의 제품을 생성하여 products 에 저장해주세요.
        productList.add(Product.builder().no("1").name("shampoo").company("LG생건").price(20000).build());
        productList.add(Product.builder().no("2").name("CokaCola").company("LG생건").price(2000).build());
        productList.add(Product.builder().no("3").name("WorldCon").company("Lotte").price(2000).build());
        productList.add(Product.builder().no("4").name("Milk").company("서울우유").price(2500).build());
        productList.add(Product.builder().no("5").name("Samdasoo").company("제주").price(1000).build());


        productList.stream().forEach(System.out::println);

    }
}
