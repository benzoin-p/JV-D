package 测试;
import java.util.*;

public class TimerTest
{
    public static void main(String[] args)
    {
        Timer timer=new Timer();
        timer.schedule(new MyTask(),5000,1000);
    }

}
