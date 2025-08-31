package java_advanced_01.teamMissionV1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;

// 학생 정보 데이터를 객체 데이터로 쓰기 위한 클래스로 공통인 Output 클래스를 구현함
public class StudentDataWriter implements Output {

    /* 학생정보를 필드로 가지면서,
     꼭 학생 정보뿐만 아니라 객체 정보를 저장할 수 있는 데이터 클래스라면 가능하도록
     직렬화를 구현하는 클래스를 가지는 와일드 카드를 통해 타입을 정의
     */
    private final Map<String, ? extends Serializable> studentInfo;

    public StudentDataWriter(Map<String, ? extends Serializable> studentInfo) {
        this.studentInfo = studentInfo;
    }

    @Override
    public void outputObject(String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(studentInfo);
            System.out.println("학생 데이터가 성공적으로 " + fileName + " 에 저장되었습니다.");
        }
    }
}