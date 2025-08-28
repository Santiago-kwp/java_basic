package java_advanced_01.day23.workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ChatClient {

  public static void main(String[] args) {
    // 필수 인자(IP, 포트, 닉네임)의 개수를 확인합니다.
    if (args.length != 3) {
      System.err.println("사용법: java -cp out ChatClient <server_ip> <port> <nickname>");
      System.exit(1);
    }

    // 명령줄 인자로부터 IP, 포트, 닉네임을 파싱합니다.
    String host = args[0];
    int port = 0;
    String nickName = args[2];

    try {
      port = Integer.parseInt(args[1]);
    } catch (NumberFormatException e) {
      System.err.println("오류: 포트 번호는 유효한 숫자여야 합니다.");
      System.exit(1);
    }

    try (Socket socket = new Socket(host, port);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        PrintWriter out = new PrintWriter(
            new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
        BufferedReader keyboard = new BufferedReader(
            new InputStreamReader(System.in, StandardCharsets.UTF_8))
    ) {

      // 사용자 닉네임 서버에 전달
      out.println(nickName);

      // 환영 메시지 콘솔 창 출력
      String welcomeMsg = in.readLine();
      System.out.println(welcomeMsg);

      // 서버로부터의 브로드캐스트 메시지를 독립적으로 수신하는 스레드를 람다식으로 구현
      Thread readerThread = new Thread(() -> {
        try (BufferedReader broadCastIn = new BufferedReader(
            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8))
        ) {
          String serverMsg;
          while (!Thread.currentThread().isInterrupted()
              && (serverMsg = broadCastIn.readLine()) != null) {
            // 서버로부터 받은 메시지를 클라이언트의 콘솔창에 출력
            // 1. 현재 프롬프트 줄 지우기: 커서를 맨 앞으로 보내고(CR), 줄의 끝까지 지움(EL)
            System.out.print("\r" + "\033[K");
            // 2. 메시지 출력
            System.out.println(serverMsg);
            // 3. 다시 프롬프트 출력
            System.out.print(nickName + "> ");
            // 4. 입력 버퍼를 비워 사용자 입력이 사라지지 않게 함
            System.out.flush();
          }
        } catch (IOException e) {
          // 서버 연결이 끊어지면 예외 발생
          System.out.println("\n[Client] 서버 연결이 종료되었습니다.");
        }
      });

      // 브로드 캐스팅된 다른 사람의 메시지 수신 쓰레드 시작
      readerThread.start();

      // 메인 스레드는 키보드 입력만 처리
      String msg;
      while (true) {
        msg = keyboard.readLine(); // 클라이언트의 키보드 입력
        if (msg == null) {
          break;   // EOF (Ctrl+D/Ctrl+Z)
        }
        // 서버에 클라이언트 메시지 전달
        out.println(msg);

      }
      // 메인 스레드가 종료되면 readerThread도 종료
      readerThread.interrupt();
      readerThread.join(); // 메인 스레드가 readerThread의 종료를 기다림
      System.out.println("[Client] Bye.");

    } catch (IOException | InterruptedException e) {
      System.err.println("[Client] Error: " + e.getMessage());
    }
  }
}



