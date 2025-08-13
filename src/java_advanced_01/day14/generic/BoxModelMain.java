package java_advanced_01.day14.generic;

public class BoxModelMain {
    public static void main(String[] args) {
        // 로켓 프레쉬 라인, 철호가 "배추", "무", "상추", "삼겹살" 구매하였다.
        // 물품을 담아서 box에 담고 box 담긴 내용을 출력하세요.
        BoxModel<String> box = new BoxModel<>();
        box.contents = new String[]{"배추", "무", "상추", "삼겹살"};
        for (String content : box.contents) {
            System.out.print(content + "\t");
        }

    }
}
