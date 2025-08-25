package java_advanced_01.day20.pratice;

import java_advanced_01.day13.B;

import java.io.*;

// 문제 9: 여러 줄 입력받아 파일에 저장
//        사용자가 입력하는 여러 줄을 받아 output.txt 파일에 저장하세요. 단, "exit"를 입력하면 종료합니다.
public class Prob9 {

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"))) {

            System.out.println("문장을 입력하세요 (exit 입력 시 종료)");

            String line;
            while(!(line = bufferedReader.readLine()).equals("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
            System.out.println("파일 저장 완료!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
