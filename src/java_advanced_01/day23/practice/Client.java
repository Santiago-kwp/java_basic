package java_advanced_01.day23.practice;

import java.io.IOException;
import java.net.Socket;

public class Client {

  public static void main(String[] args) {
    Socket socket = null;

    try {
      System.out.println("접속 요청");
      socket = new Socket("localhost", 5000);

      System.out.println("서버 접속 성공");

      System.out.println("서버 접속 해제");

    } catch (IOException e) {
      System.out.println("서버 접속 실패");
      throw new RuntimeException(e);
    }
  }

}
