package java_advanced_01.day17.morningEx;

import java.util.Arrays;
import java.util.Comparator;

public class UserMain {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("김유신", 64),
                new User("박희동", 14),
                new User("홍길동", 32),
                new User("김동성", 48),
        };

        // Comparator Interface usage
        Arrays.sort(users, new UserComparator());
        for (User user : users) {
            System.out.print(user.getName() + ": " + user.getAge() + ", ");
        }
        System.out.println();

        // Lambda식을 활용한 익명 클래스 정의 -> 내림차순 정렬
        Arrays.sort(users, (u1, u2) -> u2.getAge() - u1.getAge());
        for (User user : users) {
            System.out.print(user.getName() + ": " + user.getAge() + ", ");
        }
        System.out.println();

        // 람다식을 활용하여 이름의 사전순으로 정렬
        Arrays.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
        for (User user : users) {
            System.out.print(user.getName() + ": " + user.getAge() + ", ");
        }
        System.out.println();




        // Comparable Interface usage
        Arrays.sort(users);
        for (User user : users) {
            System.out.print(user.getName() + ": " + user.getAge() + ", ");
        }
    }
}
