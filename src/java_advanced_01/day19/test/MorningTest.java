package java_advanced_01.day19.test;

import java.util.Arrays;
import java.util.List;

public class MorningTest {
    public static void main(String[] args) {
        // 1. 정수 리스트에서 짝수를 필터링하는 자바스트림 연산을 작성하세요.
        List<Integer> integerList = Arrays.asList(1, 3, 4, 5, 6, 2, 3, 9);
        List<Integer> evenIntgerList = integerList.stream().filter(integer -> integer%2==0).toList();
        System.out.println(evenIntgerList); // [4, 6, 2]

        // 2. 리스트의 각 정수를 제곱하기 위해 map 연산을 사용하여 연산 결과를 출력하세요.
        List<Integer> squareList = integerList.stream().map(integer -> integer * integer).toList();
        System.out.println(squareList); // [1, 9, 16, 25, 36, 4, 9, 81]

        // 3. 문자열 리스트에서 중복 요소를 제거하기 위해 distinct 연산을 사용하여 결과를 출력
        List<String> stringList = Arrays.asList("monitor","keyboard","mouse","monitor","apple");
        List<String> distinctStringList = stringList.stream().distinct().toList();
        System.out.println(distinctStringList); // [monitor, keyboard, mouse, apple]

        // 4. 스트림을 사용하여 정수 리스트를 오름차순하여 출력하세요.
        List<Integer> sortedList = integerList.stream().sorted().toList();
        System.out.println(sortedList); // [1, 2, 3, 3, 4, 5, 6, 9]

        // 5. 정수 리스트에서 리스트의 모든 짝수의 합을 구하여 출력하세요.
        int evenSum = integerList.stream().filter(Integer -> Integer%2==0).reduce(0,Integer::sum);
        int evenSum2 = integerList.stream().filter(Integer -> Integer%2==0).mapToInt(Integer -> Integer).sum();

        System.out.println(evenSum);
    }
}
