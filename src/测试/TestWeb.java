package 测试;
import java.io.*;
import java.net.*;

public class TestWeb
{
    public static void main(String[] args) throws IOException
    {
        ServerSocket server=new ServerSocket(5000);
        System.out.println("[服务器上线了喵]");
            Socket client= server.accept();
            System.out.println("[连接到客户端了喵]");
            BufferedReader reader=new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            String s=null;
            while ((s= reader.readLine())!=null)
            {
                System.out.println("收到客户端的一条消息： "+s);
                writer.write("啊对对对");
                writer.newLine();
                writer.flush();
                System.out.println("[消息发送成功喵]");
            }
            reader.close();
    }

}
