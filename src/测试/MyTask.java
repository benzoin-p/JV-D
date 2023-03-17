package 测试;

import java.util.TimerTask;

public class MyTask extends TimerTask
{
    public void run()
    {
        System.out.println("5秒之后运行的定时器");
    }
}
