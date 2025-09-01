package java_advanced_01.day24.jsonbased_chatting;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import org.json.JSONObject;

// 소켓 클라이언트는? 클라이언트와 1:1로 통신하는 역할
// SocketClient는 ChatServer의 인스턴스 변수이다.
public class SocketClient {

  // 필요 객체 (필드)
  ChatServer chatServer; // ChatServer()의 메소드를 호출을 위해
  Socket socket;         // 연결을 끊을 때 필요

  DataInputStream dis;   // 문자열을 읽을 때
  DataOutputStream dos;  // 문자열을 보낼 때
  String chatName;       // 닉네임(대화명)
  String clientIp;       // 클라이언트 Ip

  public SocketClient(ChatServer chatServer, Socket socket) {
    try {
      this.chatServer = chatServer;
      this.socket = socket;
      this.dis = new DataInputStream(socket.getInputStream());
      this.dos = new DataOutputStream(socket.getOutputStream());
      InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
      this.clientIp = isa.getHostName();
      receive();
    } catch (IOException e) {
    }
  }

  // 메소드 : JSON 메시지 받기 : 클라이언트가 보낸 JSON 메시지를 읽는 업무를 수행한다.
  // dis.readUTF() 를 통해서 JSON을 읽고 JSONObject를 파싱해서 command값을 얻어내어 처리함
  // command : incomming => JSON에서 대화명을 읽는다. chatRoom에 SocketClient를 추가함.
  //         : message => 메시지를 읽고 연결되어 있는 모든 클라이언트들에게 메시지를 보낸다.
  //         : 클라이언트가 채팅을 종료할 경우 dis.readUTF()에서 IOException 발생하므로 예외 처리를 하여
  //           chatRoom 에 저장되어 있는 SocketClient를 제거한다.
  public void receive() {
    chatServer.threadPool.execute(
        () -> {
          try {
            while (true) {

              String receiveJson = dis.readUTF();
              JSONObject object = new JSONObject(receiveJson);
              String command = object.getString("command");

              switch (command) {
                case "incoming":
                  this.chatName = object.getString("data");
                  chatServer.sendToAll(this, "입장하셨습니다.");
                  chatServer.addSocketClient(this);
                  break;
                case "message":
                  String message = object.getString("data");
                  chatServer.sendToAll(this, message);
                  break;
              }

            }
          } catch (IOException e) {
            chatServer.sendToAll(this, "퇴장하셨습니다.");
            chatServer.removeSocketClient(this);
            throw new RuntimeException(e);
          }

        }

    );
  }

  // 메소드 : JSON 보내기 연결된 클라이언트로 JSON 메시지를 보내는 기능
  public void send(String json) {
    try {
      dos.writeUTF(json);
      dos.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // 메소드 연결 종료
  public void close() {
    try {
      socket.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }


}
