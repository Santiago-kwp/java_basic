package javabasic_02.day12.practiceEx.prob2;

public class Video extends Content{
    private String genre;
    public Video(String title, String genre){
        super(title);
        this.genre = genre;
    }

    @Override
    public void totalPrice() {
        switch (this.genre) {
            case "new" -> this.setPrice(2000);
            case "comic" -> this.setPrice(1500);
            case "child" -> this.setPrice(1000);
            default -> this.setPrice(500);

        }

    }
}
