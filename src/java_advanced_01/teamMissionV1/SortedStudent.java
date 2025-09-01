package java_advanced_01.teamMissionV1;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class SortedStudent implements Input, Printable {

    private HashMap<String, Student> studentInfo;
    private TreeSet<Student> sortedInfo;
    private static final String IN_FILE_NAME = "student.dat";
    private final SetOutput studentDataWriter;
    private static final String OUT_FILE_NAME = "orderByAvg.dat";


    // 인스턴스 생성 시 파일 불러오기 및 파일 쓰기 객체 초기화
    public SortedStudent() {
        this.studentInfo = (HashMap<String, Student>) loadCheck(IN_FILE_NAME);
        // 파일 미존재 시 StudentOutput 인스턴스 생성 시 에러 발생 후 프로그램 종료
        if (this.studentInfo.isEmpty()) {
            System.err.println("파일 내 학생 데이터가 존재하지 않습니다.");
        }
        this.studentDataWriter = new StudentDataWriter();

    }

    public static void main(String[] args) {
        SortedStudent sortedStudent = new SortedStudent();

        // 메소드 참조를 통해 comaparator의 compareTo 메소드 구현부 주입
        sortedStudent.createTreeSet(
            Comparator.comparingDouble(Student::getAverage).thenComparing(Student::getName));

        sortedStudent.printResult();

        sortedStudent.saveData(); // 데이터를 파일에 저장
        System.out.println("입력을 종료합니다.");
//        System.out.printf("[완료] %d명의 정보가 %s 에 저장되었습니다.\n", studentInfo.size(), FILE_NAME);
//        결과 파일: ./orderByAvg.dat
//[완료] 정렬된 결과를 파일로 저장했습니다.

    }

    public void createTreeSet(Comparator<Student> comparator) {
        sortedInfo = new TreeSet<>(comparator);
        sortedInfo.addAll(studentInfo.values());
    }

    @Override
    public void printResult() {
        System.out.println("[정렬 및 저장: 평균 오름차순]");
        System.out.println("불러온 학생 수: " + studentInfo.size());
        System.out.println("정렬 규칙: 평균 ASC, 평균 동률이면 이름 사전순 ASC\n");

        // 상위 n 명의 이름 및 평균 점수 화면 출력
        int n = 10;
        System.out.println("저장 대상(미리보기 상위 " + n + "명):");

        Iterator<Student> iterator = sortedInfo.iterator();
        while (n-- > 0 && iterator.hasNext()) {
            Student student = iterator.next();
            System.out.printf("- %s (평균 %.1f)\n", student.getName(),
                student.getAverage());
        }
        
    }

    /*
    StudentDataWriter클래스를 통해 sortedInfo를 직렬화하여 파일에 저장하는 savaDate() 메소드
    */
    public void saveData() {
        try {
            studentDataWriter.outputObject(sortedInfo, OUT_FILE_NAME);
        } catch (IOException e) {
            System.err.println("정렬된 학생 정보 저장 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
