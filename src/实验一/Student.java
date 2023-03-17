package 实验一;

public class Student
{
    private String name;
    private int age;
    private int theClass;

    Student(String name,String candidateNum,int score,int sportScore)
    {
        this.name=name;
        System.out.println(name+"的考号为："+candidateNum);
        System.out.println(name+"的综合成绩为："+score);
        System.out.println(name+"的体育成绩为："+sportScore+"\n");
    }

    Student(String name,int age,int theClass)
    {
        this.name=name;
        this.age=age;
        this.theClass=theClass;
    }

    public String getName()
    {
        return name;
    }

    public void dispInfo()
    {
        System.out.println("该学生的姓名为："+name);
        System.out.println("该学生的年龄为："+age);
        System.out.println("该学生的班级为："+theClass);
    }

}
