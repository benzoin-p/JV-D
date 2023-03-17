package 测试;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestWeeb
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            Socket socket = new Socket("127.0.0.1",5000);
            System.out.println("[客户端启动了喵]");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer.write("你妈死了");
            writer.newLine();
            writer.flush();
            System.out.println("[消息发送成功喵]");
            String s=reader.readLine();
            System.out.println("收到服务器端的一条消息："+s);
            writer.write("我是你哥哥");
            writer.newLine();
            writer.flush();
            String s1=reader.readLine();
            System.out.println("收到服务器端的一条消息："+s1);
            //String s1=reader.readLine();
            //System.out.println(s1);

            reader.close();
            socket.close();
        }
        catch(UnknownHostException e)
        {
            System.out.println("无法连接到服务器！");
        }
    }
}
