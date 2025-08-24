package java_advanced_01.bookMarketV2;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Setter
@Getter
public class Book extends Item{
    private String author;
    private String description;
    private String category;
    private String releaseDate;

    public Book(String id, String name, int unitPrice) {
        super(id, name, unitPrice);
    }

    public Book(String id, String name, int unitPrice, String author, String description, String category, String releaseDate) {
        super(id, name, unitPrice);
        this.author = author;
        this.description = description;
        this.category = category;
        this.releaseDate = releaseDate;
    }

    public void printBookInfo() {
        System.out.println(getId() + " | " + getName() + " | " + getUnitPrice() + " | " + getAuthor() + " | " + getCategory() + " | " + getReleaseDate());
    }

}
