package java_advanced_01.day17.BoardPrac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BoardExample {
    static Scanner sc = new Scanner(System.in);
    static int Bno = 1;
    List<Board> boardList = new ArrayList<>();


    public static void main(String[] args) {
        BoardExample boardExample = new BoardExample();
        boardExample.list();
    }

    public BoardExample() {
        // sample 추가
        boardList.add(new Board(Bno++, "눈 오는 날", "컨텐츠", "winter", new Date()));
        boardList.add(new Board(Bno++, "크리스마스", "컨텐츠", "winter", new Date()));
        boardList.add(new Board(Bno++, "여름에 가장 시원할 때", "컨텐츠", "summer", new Date()));
    }

    void list() { // 게시물 목록을 출력하고 mainMenu()를 실행한다.
        System.out.println(
                """
                [게시물 목록]
                ------------------------------------------------------------
                no\twriter\t\tdate\t\t\ttitle\t\t
                ------------------------------------------------------------
                """);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        for (Board board : boardList) {
            System.out.printf("%d\t%10s\t\t%10s\t\t%10s\n",
                    board.getBno(), board.getBwriter(), sdf.format(board.getBdate()), board.getBtitle());
        }
        System.out.println();

        mainMenu();
    }

    void mainMenu() {
        System.out.println(
                """
                메인 메뉴 : 1.Create  | 2. Read | 3.Clear | 4.Exit
                """);
        int choiceNum = validCheck(1, 4);

        switch (choiceNum) {
            case 1 -> create();
            case 2 -> read();
            case 3 -> clear();
            case 4 -> {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

        }
    }

    void create() {
        String title;
        String content;
        String writer;

        System.out.println("[새 게시물 입력]");
        System.out.println("제목 : ");
        title = sc.nextLine();
        System.out.println("내용 : ");
        content = sc.nextLine();
        System.out.println("작성자 : ");
        writer = sc.nextLine();


        System.out.println("--------------------------------------------");
        System.out.println("1. OK | 2. Cancel");
        System.out.println("메뉴 선택 : ");

        int menuNum = validCheck(1, 2);

        switch (menuNum) {
            case 1 -> boardList.add(new Board(Bno++,title, content, writer, new Date()));
        }
        list();
    }

    void read() {

        System.out.println("[게시물 읽기]");
        System.out.println("bno : ");

        int choiceBno = validCheck(1, Bno);

        System.out.println("#######################");
        // 게시물 내용 출력
        for (Board board:boardList) {
            if (choiceBno == board.getBno()) {
                System.out.println(board.toString());
                break;
            }
        }

        System.out.println("#######################");
        submenu(choiceBno);


    }

    void submenu(int choiceBno) {
        System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");

        int choiceNum = validCheck(1, 3);

        switch(choiceNum) {
            case 1 -> update(choiceBno);
            case 2 -> delete(choiceBno);
        }
        list();

    }

    void update(int choiceBno) {
        String title;
        String content;
        String writer;

        System.out.println("[수정 내용 입력]");
        System.out.println("제목 : ");
        title = sc.nextLine();
        System.out.println("내용 : ");
        content = sc.nextLine();
        System.out.println("작성자 : ");
        writer = sc.nextLine();


        System.out.println("--------------------------------------------");
        System.out.println("1. OK | 2. Cancel");
        System.out.println("메뉴 선택 : ");

        int menuNum = validCheck(1, 2);

        switch (menuNum) {
            case 1 -> {
                for (Board board : boardList) {
                    if (board.getBno() == choiceBno) {
                        board.setBtitle(title);
                        board.setBcontent(content);
                        board.setBwriter(writer);
                        board.setBdate(new Date());
                        break;
                    }
                }

            }
        }
        list();
    }

    void delete(int choiceBno) {
        for (Board board : boardList) {
            if (choiceBno == board.getBno()) {
                boardList.remove(board);
                break;
            }
        }

        list();
    }

    void clear() {
        boardList = new ArrayList<>();
        list();
    }

    int validCheck(int low, int high) {
        int choiceNum = 0;
        boolean validInput = false;
        // 올바른 입력이 들어올 때까지 반복합니다.
        while(!validInput) {
            try {
                choiceNum = Integer.parseInt(sc.nextLine());
                if (choiceNum < low || choiceNum > high) {
                    System.out.printf("%d부터 %d까지만 입력해주세요.",low,high);
                    continue;
                }
                validInput = true; // 유효한 입력이 들어오면 루프를 종료합니다.
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
                sc.nextLine(); // 버퍼에 남아있는 잘못된 입력을 비워줍니다.
            }
        }
        return choiceNum;
    }
}
