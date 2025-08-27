package java_advanced_01.day21.jsonEx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

// JSON 에서는 속성 순서는 중요하지 않음. 추가한 순서대로 작성하지 않아도 상관없습니다.
// 그리고 줄바꿈 처리도 되지 않습니다. 이런점이 오히려 이 점이 장점이 되어서 살아남았다.
// 네트워크의 전송량을 줄여주어 오히려 이 점이 장점이 되었다.
public class ParseJsonEx {
    public static void main(String[] args) {

        String fileName = "C:/Temp/kwp.json";
        // 파일로부터 JSON 읽어오기
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName, Charset.forName("UTF-8")))) {
            String json = bufferedReader.readLine();

            JSONObject root = new JSONObject(json);

            // 속성정보 읽기
            System.out.println("이름 : " + root.getString("name"));
            System.out.println("id : " + root.getString("id"));
            JSONObject object = root.getJSONObject("tel");
            System.out.println("home-tel : " + object.getString("home"));
            System.out.println("mobile-tel : " + object.getString("mobile"));

            JSONArray skill = root.getJSONArray("skill");
            for (int i = 0; i < skill.length(); i++) {
                System.out.print(skill.get(i) + " ");

            }


        } catch (IOException e) {
            e.getMessage();
        }

        List<String> names = Arrays.asList("박기웅","고하원", "김재윤", "이현빈", "신건");
        names.stream().sorted().forEach(System.out::print);



    }
}
