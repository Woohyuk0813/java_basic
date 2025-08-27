package javabasic_03.day22.inetaddressEX;

import java.net.InetAddress;
import java.net.UnknownHostException;

//자신의 컴퓨터에 IP주소를 얻어내는 방법
public class InetAddressEx {

    public static void main(String[] args) {
        InetAddress inetAddress = null;
        try{
            inetAddress = InetAddress.getLocalHost();
            System.out.println("나의 IP주소값 : " + inetAddress);
            InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
            for (InetAddress address : inetAddresses) {
                System.out.println(address);
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }
}
