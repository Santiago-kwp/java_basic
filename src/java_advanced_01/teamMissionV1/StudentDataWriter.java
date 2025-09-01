package java_advanced_01.teamMissionV1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// 학생 정보 데이터를 객체 데이터로 쓰기 위한 클래스로 공통인 Output 클래스를 구현함
public class StudentDataWriter implements MapOutput, SetOutput {
    // 필드 없이 메소드만 제공

    // Map 데이터를 파일로 저장하는 로직
    @Override
    public void outputObject(Map<String, ? extends Serializable> studentInfo, String fileName)
        throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(studentInfo);
            System.out.println("학생 데이터가 성공적으로 " + fileName + " 에 저장되었습니다.");
        }
    }

    // Set 데이터를 파일로 저장하는 로직
    @Override
    public void outputObject(Set<? extends Serializable> studentInfo, String fileName)
        throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(studentInfo);
            System.out.println("학생 데이터가 성공적으로 " + fileName + " 에 저장되었습니다.");
        }
    }

}