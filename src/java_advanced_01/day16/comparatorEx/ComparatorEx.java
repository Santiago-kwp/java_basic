package java_advanced_01.day16.comparatorEx;

import java.util.TreeSet;

public class ComparatorEx {
    public static void main(String[] args) {
        // 과일 가게에서 과일을 관리할 때의 기준(FruitComparator)으로 정렬하여 관리하겠다.
        TreeSet<Fruit> fruits = new TreeSet<Fruit>(new FruitComparator());

        fruits.add(new Fruit("Apple", 100));
        fruits.add(new Fruit("Banana", 50));
        fruits.add(new Fruit("PineApple", 200));

        for (Fruit fruit : fruits) {
            System.out.println(fruit.name + " " + fruit.price);
        }


    }
}
