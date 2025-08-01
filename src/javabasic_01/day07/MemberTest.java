package javabasic_01.day07;

public class MemberTest {
    public static void main(String[] args) {
        Member gildong = new Member();
        gildong.name = "홍길동";
        gildong.age = 30;
        gildong.phoneNumber = "010-1111-1111";
        gildong.emailAdress = "fc@naver.com";
        gildong.address = "서울";
        gildong.weight = 57.6;

        Member member2 = new Member();
        member2.name = "김진명";
        member2.age = 32;
        member2.phoneNumber = "010-1123-1111";
        member2.emailAdress = "fc1@naver.com";
        member2.address = "서울";
        member2.weight = 75.2;

        // 삼성 지점 sshealth 헬스 센터
        Member[] 삼성 = new Member[2];
        삼성[0] = gildong;
        삼성[1] = member2;

        // 삼성 지점 회원의 리스트 출력
        for (int i = 0; i < 삼성.length; i++) {
            Member member = 삼성[i];
            System.out.println(member.name);

        }
        for (Member member : 삼성) {
            System.out.println(member.name);
        }

//        System.out.println(member2.name);
//        System.out.println(member2.age);
//        System.out.println(member2.phoneNumber);
//        System.out.println(member2.emailAdress);
//        System.out.println(member2.address);
//        System.out.println(member2.weight);


    }
}
