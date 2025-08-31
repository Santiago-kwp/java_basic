package java_advanced_01.teamMissionV1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public interface Input {

    /* 기존 student.dat 파일 유무 확인 및 로드(없으면 신규 생성) 하는 기능의 메소드로,
        데이터를 로드하는 행위를 포함하므로 학생 정보를 요구사항에 따라 맵 객체로 반환하는 메소드로 정의
    */
    default Map<String, Student> loadCheck(String fileName) {
        // 파일은 인텔리제이 워킹디렉토리에 저장되도록 경로 설정 default로 정의
        File file = new File(fileName);

        // 파일이 존재하지 않으면 새로운 해시 맵 반환
        if (!file.exists()) {
            System.out.println("기존 파일이 존재하지 않습니다. 새로운 파일을 생성합니다.");
            return new HashMap<String, Student>();
        }

        // 파일이 존재하면 학생 데이터를 로드하여 반환
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            System.out.println("기존 파일에서 학생 데이터를 로드했습니다.");
            // Object를 Map<String, Student>로 타입 캐스팅
            return (Map<String, Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("파일을 읽어오는 중 오류가 발생했습니다: " + e.getMessage());
            // 오류 발생 시에도 빈 맵 객체 반환
            return new HashMap<>();
        }
    }

    void loadObjectFromFile(String fileName) throws IOException, ClassNotFoundException;
}
