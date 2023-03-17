package 测试;

import java.net.*;

public class Test
{
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost.getHostAddress());
        System.out.println(localHost.getHostName());
    }

}
