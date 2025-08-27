package java_advanced_01.day22.net.echoPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String message;
    // 1. 서버의 IP 주소 및 포트번호 연결
    try (Socket socket = new Socket("localhost", 50003)) {

      while (true) {
        System.out.println("서버에 전달할 메시지를 입력하세요. 그만 하고 싶으시면 q/Q를 입력하세요.");
        // 데이터 출력 스트림 생성 및 서버에 입력 메시지 전달
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF(scanner.nextLine());

        // 데이터 입력 스트림 생성
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        message = dataInputStream.readUTF();
        if (message.equalsIgnoreCase("q")) {
          dataOutputStream.flush();
          dataInputStream.close();
          dataOutputStream.close();
          break;
        }
        System.out.println(message);

      }

    } catch (Exception e) {
      System.out.println("소켓 연결 문제");
    }

  }

}
