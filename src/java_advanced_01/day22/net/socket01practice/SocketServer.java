package java_advanced_01.day22.net.socket01practice;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {

  // 서버 소켓 생성
  private static ServerSocket serverSocket = null;

  public static void main(String[] args) {
    System.out.println("--------------------Starting server socket------------------");
    System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter키를 입력하세요.");
    System.out.println("------------------------------------------------------------");

    // TCP 서버 시작
    startServer();

    // 키보드 입력 - q/Q를 입력 시 서버 종료
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String key = scanner.nextLine();
      if (key.equalsIgnoreCase("q")) {
        break;
      }
    }

    // TCP 서버 종료
    stopServer();

  }

  public static void startServer() {
    // 스레드 Thread : 실행 흐름의 단위
    Thread thread = new Thread() {
      @Override
      public void run() {

        try {
          // 1. 바인딩 : 서버의 IP 와 통신할 포트 바인딩
          serverSocket = new ServerSocket(50002);
          System.out.println("[서버]시작됨!");
          while (true) {

            System.out.println("\n[서버] 연결 요청을 기다립니다.\n");

            // 연결 수락
            Socket socket = serverSocket.accept();

            // 연결된 클라이언트의 IP 정보 얻기
            InetSocketAddress ia = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println(
                "[클라이언트]" + ia.getHostName() + " 의 주소 : " + ia.getAddress() + " : " + ia.getPort()
                    + "의 연결 수락함");

          }

        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    };
    // 쓰레드 작업 시작 -> run() 동작
    thread.start();
  }


  public static void stopServer() {
    System.out.println("서버 종료");
    try {
      serverSocket.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}
