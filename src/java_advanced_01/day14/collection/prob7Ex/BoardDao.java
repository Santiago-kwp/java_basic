package java_advanced_01.day14.collection.prob7Ex;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> boards = new ArrayList<>();
        boards.add(new Board("제목1","내용1"));
        boards.add(new Board("제목2","내용2"));
        boards.add(new Board("제목3","내용3"));

        return boards;
    }
}
