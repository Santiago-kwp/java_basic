package java_advanced_01.day16.unmodifiable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class immutableEx {
    public static void main(String[] args) {
        //List 불변 컬렉션 생성 -> 정적 메소드 of 를 사용한다.
        List<String> list = List.of("apple", "banana", "orange");

//        list.add("pineapple"); => UnsupportedOperationException raise
        for (String fruit : list) {
            System.out.print(fruit+ " ");
        }
        System.out.println();
        Map<String, Integer> map = Map.of("apple", 10000, "banana", 2500, "orange", 3000);
        for (String s : map.keySet()) {
            System.out.print(s + " " + map.get(s) + " ");
        }

    }

    // 배열로부터 수정할 수 없는 List 컬렉션 생성 방법 => 람다식에서 많이 활용함.
    String[] arr = new String[]{"apple", "banana", "orange"};
    List<String> list2 = List.of(arr);
    List<String> list3 = Arrays.asList(arr);

}
