package java_advanced_01.teamMissionV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StudentOutput implements Input, Printable {

    private HashMap<String, Student> studentInfo;
    private List<Student> datas;
    //    private List<String> names; // 불필요함
    private static final String FILE_NAME = "student.dat";

    public StudentOutput() {
        this.studentInfo = (HashMap<String, Student>) loadCheck(FILE_NAME);
        // 파일 미존재 시 StudentOutput 인스턴스 생성 시 에러 발생 후 프로그램 종료
        if (this.studentInfo.isEmpty()) {
            System.err.println("파일 내 학생 데이터가 존재하지 않습니다.");
        }
    }

    public static void main(String[] args) {

        StudentOutput studentOutput = new StudentOutput();

        studentOutput.rearrangeData(Comparator.comparingDouble(Student::getAverage).reversed());

        studentOutput.printResult();

    }

    // 해시맵에서 키를 꺼내 가장 높은 평균(highest AVG) 학생을 찾아 datas에 추가하고 키 제거하는 선택
    public void rearrangeData(Comparator<Student> comparator) {
        datas = new ArrayList<>(studentInfo.values());
        datas.sort(comparator);
    }

    @Override
    public void printResult() {
        System.out.println("[평균 오름차순 성적표]\n");
        datas.forEach(System.out::println);
    }

}
