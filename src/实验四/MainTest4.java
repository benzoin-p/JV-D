package 实验四;

public class MainTest4
{
    public static void main(String[] args)
    {
        MyThreadImp target = new MyThreadImp();
        Thread th1 = new Thread(target);
        Thread th2 = new Thread(target);
        th1.start();
        th2.start();
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread wrong");
        }
    }
}
