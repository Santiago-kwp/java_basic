package javabasic_02.day10.mornigtest;

public class ShopService {
    private static ShopService instance;

    private ShopService(){}

    public static ShopService getInstance() {
        if(instance == null) {
            instance = new ShopService();
        }
        return instance;
    }

    public static void main(String[] args) {

        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 ShopService 객체입니다.");
        } else {
            System.out.println("다른 ShopService 객체입니다.");
        }

    }
}
