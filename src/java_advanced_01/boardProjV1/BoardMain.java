package java_advanced_01.boardProjV1;

public class BoardMain {

    public static void main(String[] args) {
        BoardManager boardManager = new BoardManager(); // 생성자 injection ~ loose coupling
        BoardExample boards = new BoardExample(boardManager); // 보드 매니저가 보드 example을 처리할 수 있게끔 권한을 획득함.
        boards.run();

    }
}
