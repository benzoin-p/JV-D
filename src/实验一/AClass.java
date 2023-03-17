package 实验一;

public class AClass
{
    private static int classNum;
    private static String teacherName;
    private static Student monitor;

    AClass(int classNum,String teacherName)
    {
        AClass.classNum=classNum;
        AClass.teacherName=teacherName;
    }

    public static void setMonitor(Student monitor) {
        AClass.monitor = monitor;
    }

    public static String getMonitorName()
    {
        return monitor.getName();
    }

    public static void dispAlassInfo()
    {
        System.out.println("该班级的人数为："+classNum);
        System.out.println("该班级教师的名字为："+teacherName);
        System.out.println("该班级班长的名字为："+getMonitorName()+"\n");
    }
}
