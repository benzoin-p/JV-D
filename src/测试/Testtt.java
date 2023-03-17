package 测试;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Testtt
{
    public static void main(String[] args)
    {
        Stu s1=new Stu("阿爸爸",5);
        Stu s2=new Stu("safjasof",114514);
        try
        {
            FileOutputStream fos = new FileOutputStream("D:/whu/java/实验/text.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.writeObject(s2);
            System.out.println("啊对对对");
            oos.close();
        }
        catch(IOException e)
        {
            System.out.println("操作错误！");
        }
    }
}
