package java_advanced_01.day17.BoardPrac;

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
                no\twriter\t\tdate\t\ttitle\t\t
                ------------------------------------------------------------
                """);


        for (Board board : boardList) {
            System.out.printf("%d\t%-20s\t\t-20s\t\t-20s\t\t\n",
                    board.getBno(), board.getBwriter(), board.getBdate(), board.getBtitle());
        }
        System.out.println();

        mainMenu();
    }

    void mainMenu() {
        System.out.println(
                """
                메인 메뉴 : 1.Create  | 2. Read | 3.Clear | 4.Exit
                """);
        int choiceNum = 0;
        boolean validInput = false;

        // 올바른 입력이 들어올 때까지 반복합니다.
        while(!validInput) {
            try {
                System.out.println("메뉴 선택 : ");
                choiceNum = Integer.parseInt(sc.nextLine());
                if (choiceNum < 1 || choiceNum > 4) {
                    System.out.println("1부터 4까지만 입력해주세요.");
                    continue;
                }
                validInput = true; // 유효한 입력이 들어오면 루프를 종료합니다.
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
                sc.nextLine(); // 버퍼에 남아있는 잘못된 입력을 비워줍니다.
            }
        }

        switch (choiceNum) {
            case 1 -> create();
            case 2 -> read();
            case 3 -> clear();
            case 4 -> System.out.println("프로그램을 종료합니다.");
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
        boolean validInput = false;
        int menuNum = 0;
        // 올바른 입력이 들어올 때까지 반복합니다.
        while(!validInput) {
            try {
                menuNum = Integer.parseInt(sc.nextLine());
                if (menuNum < 1 || menuNum > 2) {
                    System.out.println("1부터 2까지만 입력해주세요.");
                    continue;
                }
                validInput = true; // 유효한 입력이 들어오면 루프를 종료합니다.
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
                sc.nextLine(); // 버퍼에 남아있는 잘못된 입력을 비워줍니다.
            }
        }

        switch (menuNum) {
            case 1 -> boardList.add(new Board(Bno++,title, content, writer, new Date()));
        }
        list();
    }

    void read() {
        int choiceBno = 0;
        System.out.println("[게시물 읽기]");
        System.out.println("bno : ");

        boolean validInput = false;
        // 올바른 입력이 들어올 때까지 반복합니다.
        while(!validInput) {
            try {
                choiceBno = Integer.parseInt(sc.nextLine());
                if (choiceBno < 1 || choiceBno > Bno) {
                    System.out.printf("1부터 %d까지만 입력해주세요.\n",Bno);
                    continue;
                }
                validInput = true; // 유효한 입력이 들어오면 루프를 종료합니다.
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
                sc.nextLine(); // 버퍼에 남아있는 잘못된 입력을 비워줍니다.
            }
        }
        System.out.println("#######################");
        // 게시물 내용 출력
        System.out.println(boardList.get(choiceBno).toString());
        System.out.println("#######################");
        submenu(choiceBno);


    }

    void submenu(int choiceBno) {
        System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
        int choiceNum = 0;
        boolean validInput = false;
        // 올바른 입력이 들어올 때까지 반복합니다.
        while(!validInput) {
            try {
                choiceNum = Integer.parseInt(sc.nextLine());
                if (choiceNum < 1 || choiceNum > 3) {
                    System.out.printf("1부터 3까지만 입력해주세요.\n");
                    continue;
                }
                validInput = true; // 유효한 입력이 들어오면 루프를 종료합니다.
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
                sc.nextLine(); // 버퍼에 남아있는 잘못된 입력을 비워줍니다.
            }
        }

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
        boolean validInput = false;
        int menuNum = 1;
        // 올바른 입력이 들어올 때까지 반복합니다.
        while(!validInput) {
            try {
                menuNum = Integer.parseInt(sc.nextLine());
                if (menuNum < 1 || menuNum > 2) {
                    System.out.println("1부터 2까지만 입력해주세요.");
                    continue;
                }
                validInput = true; // 유효한 입력이 들어오면 루프를 종료합니다.
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해 주세요.");
                sc.nextLine(); // 버퍼에 남아있는 잘못된 입력을 비워줍니다.
            }
        }

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
}
