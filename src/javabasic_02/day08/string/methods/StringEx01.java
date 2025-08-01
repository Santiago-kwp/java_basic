package javabasic_02.day08.string.methods;

public class StringEx01 {
    public static void main(String[] args) {
        String subject = "자바객체프로그래밍";

        char charValue = subject.charAt(0);
        System.out.println(charValue);

        String ssn = "9508213456123";
        char gender = ssn.charAt(6);
        switch (gender) {
            case '1':
            case '3':
                System.out.println("남성");
                break;

            case '2':
            case '4':
                System.out.println("여성");
                break;

        }

        // 2. 문자열 길이가 필요할 때 length()
        int length = ssn.length();
        System.out.println(length);

        // 3. 문자열 대체 기능 : replace("원본 문자열", "바꾸고 싶은 문자열")
        String oldStr = "신세계 자바 과정";
        // oldStr의 문자열을 "신세계 자바 백엔드 과정" 요청
        String newStr = oldStr.replace("자바", "자바 백엔드");
        System.out.println(newStr);

        // 4. 문자열 잘라내기 : substring(int beginIndex) - 시작부터 끝까지, substring(int beginIndex, int endIndex)
        String ssn1 = "880815-1234567";

        // - 기준으로 앞숫자 문자열과 뒤숫자를 분리하여 각각 추출하여 출력하세요.

        String ssn1Front = ssn1.substring(0,6); // beginIndex부터 endIndex -1 까지 추출하므로 endIndex에 5가 아닌 6을 넣어야 함
        String ssn1Back = ssn1.substring(7);
        System.out.println(ssn1Front);
        System.out.println(ssn1Back);

        // 5. 문자열 찾기 : 문자열에서 특정문자의 위치 찾을 때 indexOf()
        int index = subject.indexOf("프로그래밍");

        if(index == -1) System.out.println("포함되어 있지 않다.");
        else System.out.println("포함되어 있다.");

        System.out.println(index);

        // 6. 문자열이 포함여부 확인 : contains()
        boolean result = subject.contains("프로그래밍");
        System.out.println(result);

        // 7. *************문자열 분리 : split() -> 문자열을 토큰과 구분자(delimiter)로 분리
        String board = "번호,제목,내용,성명";
        String[] boardStr = board.split(",");
        for (String b : boardStr)
            System.out.print(b + " ");




    }
}
