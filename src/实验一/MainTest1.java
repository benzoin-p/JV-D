package 实验一;

public class MainTest1
{


        public static void main(String[] args)
        {
            AClass testClass = new AClass(35,"T1");
            Student student1 = new Student("S1",19,4);
            Student student2 = new Student("S2","20200002",90,80);

            AClass.setMonitor(student2);
            String monitorName = testClass.getMonitorName();
            System.out.println("返回的班长名字为："+monitorName+"\n");
            AClass.dispAlassInfo();

            String studentName=student1.getName();
            System.out.println("返回的学生名字为："+studentName+"\n");
            student1.dispInfo();

        }



}
