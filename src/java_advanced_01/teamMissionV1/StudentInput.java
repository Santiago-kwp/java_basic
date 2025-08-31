package java_advanced_01.teamMissionV1;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
 StudentInput 클래스의 역할과 책임 : 콘솔 화면에서 학생 정보를 입력받는 화면 UI 제공
 - 요구사항인 사용자로부터 입력 받은 정보를 student.dat 파일에 객체 형태로 저장은
    Output 인터페이스의 OutputObject 추상 메소드를 구현한 StudentDataWriter 의 역할로 위임함
 */
public class StudentInput implements Input {

    private HashMap<String, Student> studentInfo;
    private Scanner scanner = new Scanner(System.in);
    private static final String FILE_NAME = "student.dat";
    private final Output studentDataWriter;

    public static void main(String[] args) {
        StudentInput studentInput = new StudentInput();
        studentInput.run();
    }

    // 생성자에서 학생 정보 파일 초기화 및 학생 정보 쓰기 객체 선언
    public StudentInput() {
        studentInfo = (HashMap<String, Student>) loadCheck(FILE_NAME);
        this.studentDataWriter = new StudentDataWriter(studentInfo);

    }

    public void run() {
        printUsage();

        while (true) {
            System.out.print("이름: ");
            String name = scanner.nextLine();

            if ("^^".equals(name)) {
                break; // 종료 조건
            }

            // 중복 이름 검사 및 학생 데이터 입력
            Student newStudent = checkKeyAndInputData(name); // 기존 학생 객체가 없으므로 null 전달

            if (newStudent != null) {
                // 유효한 데이터일 경우 맵에 저장하고 결과 출력
                studentInfo.put(newStudent.getName(), newStudent);
                System.out.println("=> 저장됨: " + newStudent);
            }

        }

        saveData(); // 데이터를 파일에 저장
        System.out.println("입력을 종료합니다.");
        System.out.printf("[완료] %d명의 정보가 %s 에 저장되었습니다.\n", studentInfo.size(), FILE_NAME);

    }

    // 사용자에게 프로그램 사용법과 안내 메시지를 출력
    private void printUsage() {
        System.out.println("""
                            [학생 성적 입력 프로그램]
                            - 종료하려면 이름에 ^^ 를 입력하세요.
                            - 점수는 0~100 사이의 정수만 허용됩니다.
                            """);
    }

    /* checkKeyAndInputData
     * 중복 이름 검사, 점수 유효성 검사, 총점/평균/학점 산출 후 맵에 담는 메소드
     * * @return 유효한 학생 데이터 맵 또는 종료를 위한 null
     */

    Student checkKeyAndInputData(String name) {
        // 1. 중복 이름 검사
        if (studentInfo.containsKey(name)) {
            System.out.println("[오류] 이미 존재하는 학생 이름입니다. 다른 이름을 입력하세요.");
            return null; // 중복 이름일 경우 null 반환
        }

        // 2. 점수 입력 및 유효성 검사
        try {
            int korean = getScore("국어");
            int english = getScore("영어");
            int math = getScore("수학");
            int science = getScore("과학");

            // 3. 총점, 평균, 학점 계산
            int total = korean + english + math + science;
            double average = total / 4.0;
            String grade = getGrade(average);

            // 4. 모든 계산된 값을 포함하여 Student 객체를 빌더로 생성 및 반환
            return Student.builder().name(name).record(List.of(korean,english,math,science))
                    .total(total).average(average).grade(grade).build();

        } catch (IllegalArgumentException e) {
            System.out.println("[오류] " + e.getMessage());
            return null;
        }

    }

    // 점수 입력 및 유효성 검사 헬퍼 메서드
    private int getScore(String subject) {
        while (true) {
            try {
                System.out.printf("%s: ", subject);
                String input = scanner.nextLine();
                int score = Integer.parseInt(input);
                if (score < 0 || score > 100) {
                    System.out.println("점수는 0~100 사이의 정수만 입력하세요.");
                    continue;
                }
                return score;
            } catch (NumberFormatException e) {
                System.out.println("[오류] 올바른 숫자를 입력하세요.");
            }
        }
    }

    // 학점 산출 메서드
    private String getGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }


    @Override
    public void loadObjectFromFile(String fileName) throws IOException, ClassNotFoundException {

    }

    /*
     StudentDataWriter클래스를 통해 studentInfo를 직렬화하여 파일에 저장하는 savaDate() 메소드
     */
    public void saveData() {
        try {
            studentDataWriter.outputObject(FILE_NAME);
        } catch (IOException e) {
            System.err.println("학생 정보 저장 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
