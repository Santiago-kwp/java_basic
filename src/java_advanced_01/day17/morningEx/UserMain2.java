package java_advanced_01.day17.morningEx;

import java.util.Arrays;
import java.util.Comparator;

public class UserMain2 {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("김유신", 64),
                new User("박희동", 14),
                new User("홍길동", 32),
                new User("김동성", 50),
                new User("김동성", 48),
        };

        System.out.println("------------나이 순 오름차순------------");
        Arrays.sort(users, Comparator.comparing(User::getAge));
        for(User user : users) {
            System.out.print(user.getName() + ": " + user.getAge() + ", ");
        }
        System.out.println();

        System.out.println("------------이름 순 오름차순------------");
        Arrays.sort(users, Comparator.comparing(User::getName));
        for(User user : users) {
            System.out.print(user.getName() + ": " + user.getAge() + ", ");
        }
        System.out.println();
        System.out.println("---------이름 순 오름차순 후 같은 이름이면 나이순으로 정렬 ---------");
        Arrays.sort(users, Comparator.comparing(User::getName).thenComparing(User::getAge));
        for(User user : users) {
            System.out.print(user.getName() + ": " + user.getAge() + ", ");
        }

    }
}
