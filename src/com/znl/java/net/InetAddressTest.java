package com.znl.java.net;

import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @Package: com.znl.java.net
 * @ClassName: InetAddressTest
 * @Author Frank
 * @Data 2021-09-20-16:15
 * @Description:
 *
 * InetAddress测试
 *
 */
public class InetAddressTest {


    @Test
    public void testt1() throws IOException {
        InetAddress net = InetAddress.getByName("web.teld3.top");

        System.out.println(net.getHostName());
        System.out.println(net.getHostAddress());

        System.out.println(InetAddress.getLocalHost());
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.isReachable(15));
        System.out.println(InetAddress.getByName("web.teld3.top"));



    }
}
