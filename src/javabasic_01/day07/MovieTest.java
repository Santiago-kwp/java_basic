package javabasic_01.day07;

public class MovieTest {
    public static void main(String[] args) {
        Movie avatar = new Movie();
        avatar.title = "아바타";
        avatar.openDate = "2022.12.14";
        avatar.mainActor = "제이크 설리";
        avatar.genre = "액션";
        avatar.runningTime = 192;
        avatar.enableAge = 12;


        // Movie 클래스 타입으로 영화3편을 배열 movie List에 저장하고
        // 저장한 영화의 제목을 iter방법으로 출력

        Movie spiderman = new Movie();
        spiderman.title = "스파이더맨";

        Movie darknight = new Movie();
        darknight.title = "다크나이트";

        Movie[] movies = new Movie[3];
        movies[0] = avatar;
        movies[1] = spiderman;
        movies[2] = darknight;

        for (Movie movie : movies) {
            System.out.printf(movie.title+ " ");

        }

    }
}
