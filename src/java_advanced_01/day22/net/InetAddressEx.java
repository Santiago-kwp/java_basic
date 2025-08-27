package java_advanced_01.day22.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

  // 자신의 컴퓨터의 IP address를 얻어내는 방법
  public static void main(String[] args) {

    InetAddress inetAddress = null;
    try {
      inetAddress = InetAddress.getLocalHost();
      System.out.println("나의 IP 주소값 : " + inetAddress);

      InetAddress[] iaAddress = InetAddress.getAllByName("www.google.com");
      for (InetAddress inetAddress1 : iaAddress) {
        System.out.println(inetAddress1);
      }
    } catch (UnknownHostException e) {
      throw new RuntimeException(e);
    }

  }
}
