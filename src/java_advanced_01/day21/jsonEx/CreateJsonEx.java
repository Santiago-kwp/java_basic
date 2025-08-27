package java_advanced_01.day21.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJsonEx {
    public static void main(String[] args) {
        // 1. JSON 객체 생성
        JSONObject root = new JSONObject();

        // 2. 속성 추가
        root.put("id","kwp");
        root.put("name","박기웅");
        root.put("password","1234");


        // 3. 복합 속성 추가
        JSONObject tel = new JSONObject();
        tel.put("home","010-1111-1414");
        tel.put("mobile","010-1112-1818");
        root.put("tel",tel);

        JSONArray skill = new JSONArray();
        skill.put("JAVA");
        skill.put("HTML");
        skill.put("JPA");
        root.put("skill",skill);



        // 4. JSON 얻기
        String json = root.toString();

        // 5. 콘솔에 출력
        System.out.println(json);

        // 6. 파일에 저장
        try ( Writer writer = new FileWriter("C:/Temp/kwp.json", Charset.forName("UTF-8"))) {
            writer.write(json);

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
