package java_advanced_01.day22.net.echoPractice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

  // 서버소켓 선언
  private static ServerSocket serverSocket = null;

  public static void main(String[] args) {
    System.out.println("--------------------서버를 구동합니다-------------------");
    System.out.println("-------서버 종료를 원하시면 q/Q를 입력하세요------------");

    // 1. TCP 서버 시작
    startServer();

    // 서버 끄는 로직
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("q")) {
        break;
      }
    }

    // 2. TCP 서버 중지
    stopServer();

  }

  public static void startServer() {

    Thread thread = new Thread() {
      @Override
      public void run() {
        // 서버 소켓 바인딩
        try {
          serverSocket = new ServerSocket(50003);

          // 클라이언트의 요청 응답 리스너 객체 생성 => 연결 완료
          Socket socket = serverSocket.accept();

          // 클라이언트의 상태 출력
          InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
          System.out.println("[서버] " + isa.getHostName() + "의 연결 요청을 수락함");

          while (true) {
            // 클라이언트로부터 데이터 받기
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String message = dataInputStream.readUTF();

            // 클라이언트에게 데이터 보내기
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF(message);

            // 출력 스트림 물 내리기
            dataOutputStream.flush();

            //연결 끊기
            System.out.println("[클라이언트로 부터 메시지 : " + message + " 를 받음");
            if (message.equalsIgnoreCase("q")) {
              socket.close();
              System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");
              break;
            }
          }


        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
    };
    thread.start();

  }

  public static void stopServer() {
    try {
      //ServerSocket을 닫고 Port 언바인딩
      serverSocket.close();
      System.out.println("[서버] 종료됨 ");
    } catch (IOException e1) {
      System.out.println("서버 종료 문제");
    }
  }

}
