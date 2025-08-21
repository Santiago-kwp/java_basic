package java_advanced_01.day18;

import java.util.*;
import java.util.stream.Stream;

public class StreamEx01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }

        // 향상된 for를 이용하여 요소를 하나씩 처리하였다.
        for (String item : list) {
            System.out.println(item);
        }

        // Iterator 사용
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Java8 부터 Stream을 사용하여 요소들이 하나씩 흘러가면서 처리하는 방법을 제시함.
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        // Set names에 홍길동, 김나무, 김꽃분 세 명의 회원을 저장하고 회원의 이름을 stream을 이용하여 출력하시오.
        Set<String> names = new HashSet<>();
        names.add("홍길동");
        names.add("김나무");
        names.add("김꽃분");
        Stream<String> stream1 = names.stream();
        stream1.forEach(System.out::println);

        // 1. 내부 반복자이므로 처리 속도가 빠르다. 병렬처리에 효율적이다.
        // 2. 람다식으로 다양한 요소의 처리가 가능하다.
        // 3. 중간처리 최종 처리를 해서 파이프라인을 형성할 수 있다.





    }
}
