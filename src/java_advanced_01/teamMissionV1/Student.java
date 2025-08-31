package java_advanced_01.teamMissionV1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Student implements Serializable {
    // 요구사항에 맞게 Student 클래스를 구현하되, 최대한 단일 책임원칙에 따라 데이터 클래스로만의 역할 부여
    // 점수를 계산하는 로직, 파일에 저장, 복원 기능은 분리함.
    private static final long serialVersionUID = 1L;
    private String name;
    private List<Integer> record; // 과목 점수는 차례대로 국어, 영어, 수학, 과학 점수 순
    private int total;
    private double average;
    private String grade;

    /*
    Carol
   점수: 국어 = 70, 영어 = 70, 수학 = 70, 과학 = 70
   총점: 280, 평균: 70.0, 학점: C
     */
    @Override
    public String toString() {
        return String.format(
                        " %s\n" +
                        " 점수: 국어 = %d, 영어 = %d, 수학 = %d, 과학 = %d\n" +
                        " 총점: %d, 평균: %.1f, 학점: %s\n",
                name, record.get(0), record.get(1), record.get(2), record.get(3),
                total, average, grade
        );
    }


}
