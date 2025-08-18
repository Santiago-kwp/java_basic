package java_advanced_01.day15.collection.mapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("A", 1);
        map.put("B", 1);
        map.put("C", 1);
        map.put("D", 1);
        System.out.println(map.size());

        // 객체 읽기 (Read, Get) ==> Key를 이용해서 읽기
        String key = "A";
        int value = map.get(key);
        System.out.println(value);

        // 키 Set 컬렉션을 얻고, 반복해서 키와 값을 읽고 싶다.
        Set<String> keyset = map.keySet();
        Iterator<String> iterator = keyset.iterator(); // 키를 반복하기 위해서 반복자 생성
        while(iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }

        // 엔트리 Set 컬렉션을 얻고 반복해서 키와 값을 얻는 방법
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String,Integer> entry = entryIterator.next();
            String k = entry.getKey();
            int v = entry.getValue();
            System.out.println(k + " : " + v);

        }

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            String k = entry.getKey();
            int v = entry.getValue();
            System.out.println(k + " : " + v);
        }

        // 키로 엔트리 삭제
        map.remove("B");
        System.out.println(map.size());



    }
}
