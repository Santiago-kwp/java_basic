package java_advanced_01.day19.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice","Bobi","Charlie","David","Elvis");

        // 1. 이름 중 "A"로 시작하는 이름을 수집하여 출력하세요.
        List<String> filteredNames = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
//        names.stream().filter(s -> s.startsWith("A")).forEach(s -> System.out.print(s+" "));
        System.out.println();

        List<String> names2 = Arrays.asList("Alice","Bobi","Charlie");

        // 2. 각 이름의 길이를 세어서 출력하세요. 결과 : [ 5, 4, 7]
        names2.stream().mapToInt(String::length).forEach(s -> System.out.print(s + " "));
    }
}
