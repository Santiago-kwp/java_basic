package java_advanced_01.day23.practice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  private static ServerSocket serverSocket = null;

  public static void main(String[] args) {

    // 서버소캣 객체 생성
    try {
      serverSocket = new ServerSocket(5000);

      Socket socket = serverSocket.accept();
      System.out.println("클라이언트 : " + socket.getInetAddress() + "와 서버와 연결이 되었습니다.");
      System.out.println("서버와 연결이 해제되었습니다.");
      serverSocket.close();


    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
