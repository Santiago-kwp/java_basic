package java_advanced_01.bookMarketV2;

import java_advanced_01.bookMarketV2.common.MarketText;

import java.util.List;

public class Admin extends Person{
    // volatile 키워드 사용 시 멀티스레딩을 쓰더라도 uniqueInstance 변수가
    // SingleTone 인스턴스로 초기화되는 과정이 올바르게 진행됨.
    private volatile static Admin uniqueInstance;
    private final String id;
    private final String password;

    private Admin(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public static Admin getInstance() {
        if (uniqueInstance == null) {
            synchronized (Admin.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Admin(getInstance().id, getInstance().password);
                }
            }
        }
        return uniqueInstance;
    }


    public void viewAllUserCarts(UserDB userDB) {
        System.out.println(MarketText.BORDER_LINE.getText());
        System.out.println(getName() + "님이 모든 사용자 장바구니를 조회합니다.");
        List<User> allUsers = userDB.getAllUsers();
        if (allUsers.isEmpty()) {
            System.out.println("등록된 일반 사용자가 없습니다.");
            return;
        }
        for (User user : allUsers) {
            System.out.println(MarketText.BORDER_LINE.getText());
            System.out.println("사용자: " + user.getName());
            user.getCart().printItems();
        }
        System.out.println(MarketText.BORDER_LINE.getText());
    }
}
