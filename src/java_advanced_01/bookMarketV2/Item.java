package java_advanced_01.bookMarketV2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
public abstract class Item {
    private String id;
    private String name;
    private int unitPrice;

    /**
     id가 같은 Item 객체는 동일하다고 판단합니다.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    /**
     id를 기반으로 해시 코드를 생성합니다.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
