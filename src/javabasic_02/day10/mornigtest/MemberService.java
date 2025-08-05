package javabasic_02.day10.mornigtest;

public class MemberService {

    public boolean login(String id,String password){
        return id.equals("hong") && password.equals("123456");

    }
    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hone", "12345");



    }
}
