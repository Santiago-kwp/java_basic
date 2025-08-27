package java_advanced_01.day22.net.socket01practice;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

  public static void main(String[] args) {

    // 서버의 IP 주소와 포트번호에 맞춰서 연결 요청해야 됨

    try (Socket socket = new Socket("localhost", 50002)) {
      System.out.println("Connected to server 성공!");

      socket.close();
      System.out.println("클라이언트 연결 종료");

    } catch (UnknownHostException e) {
      System.out.println("연결 실패");
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}
