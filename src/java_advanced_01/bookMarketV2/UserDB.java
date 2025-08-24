package java_advanced_01.bookMarketV2;

import java.util.*;
import java.util.stream.Collectors;

public class UserDB {
    private final Map<String, User> users;

    public UserDB() {
        this.users = new HashMap<>();
    }
    public void addUser(String id, User user) {
        users.put(id, user);
    }

    public User getUser(String id) {
        Optional<User> optionalUser = Optional.ofNullable(users.get(id));
        if (optionalUser.isPresent()) { return optionalUser.get(); }
        else {
            System.out.println("해당 id를 가진 사용자가 없습니다.");
            return null;
        }
    }

    public List<User> getAllUsers() {
        // 불변성 유지를 위해 새로운 리스트로 반환
        return new ArrayList<>(users.values());
    }

}
