package java_advanced_01.bookMarketV2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookDB {

    private Map<String,Book> bookMap;

    public BookDB() {
        bookMap = new HashMap<>();
        bookMap.put("ISBN1234", Book.builder()
                .id("ISBN1234")
                .unitPrice(27000)
                .author("송미영")
                .name("쉽게 배우는 JSP 웹 프로그래밍")
                .description("단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍")
                .category("IT전문서")
                .releaseDate("2018/10/08").build());


        bookMap.put("ISBN1235", Book.builder()
                .id("ISBN1235")
                .unitPrice(33000)
                .author("우재남")
                .name("안드로이드 프로그래밍")
                .description("실습 단계별 명쾌한 멘토링!")
                .category("IT전문서")
                .releaseDate("2018/10/08").build());

        bookMap.put("ISBN1236", Book.builder()
                .id("ISBN1236")
                .unitPrice(22000)
                .author("고광일")
                .name("스크래치")
                .description("컴퓨팅 사고력을 키우는 블록 코딩")
                .category("컴퓨터입문")
                .releaseDate("2019/06/10").build());

    }

    public Book getBook(String id) {
        Optional<Book> optionalBook = Optional.ofNullable(bookMap.get(id));
        if (optionalBook.isPresent()) { return optionalBook.get(); }
        else {
            System.out.println("해당 id를 가진 책이 없습니다.");
            return null;
        }
    }

    public List<Book> getAllBooks() {
        return bookMap.values().stream().collect(Collectors.toList());
    }

    public void showAllBooks() {
        bookMap.values().stream().forEach(Book::printBookInfo);
    }


}
