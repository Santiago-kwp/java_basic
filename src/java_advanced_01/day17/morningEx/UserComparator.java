package java_advanced_01.day17.morningEx;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2) {
        return u1.getAge() - u2.getAge();
    }
}
