package 测试;
import java.io.Serializable;

public class Stu implements Serializable
{
    public String name;
    public int age;
    public Stu(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
