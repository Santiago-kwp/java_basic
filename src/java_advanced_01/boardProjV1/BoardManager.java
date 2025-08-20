package java_advanced_01.boardProjV1;

import java.util.LinkedHashMap;
import java.util.Map;

public class BoardManager { // 계정을 의미함.
    private Map<String, Board> boardMap = new LinkedHashMap<>();

    // 한 명의 최고 관리자가 관리하겠다 -> 싱글톤 패턴
    // admin 계정은 게시글 저장소를 관리한다.
    private static BoardManager boardManagerSingleton = new BoardManager();

    public static BoardManager getInstance() { // 보드 매니저의 권한을 제공할 때 getInstance 제공
        return boardManagerSingleton;
    }

    public Map<String, Board> getBoardMap() {
        return boardMap;
    }

    public void setBoardMap(Map<String, Board> boardMap) {
        this.boardMap = boardMap;
    }
}
