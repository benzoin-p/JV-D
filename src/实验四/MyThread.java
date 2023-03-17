package 实验四;

public class MyThread
{
    public static void main(String[] args)
    {
        //新建两个线程
        DelayThread thread1 = new DelayThread();
        DelayThread thread2 = new DelayThread();

        //两个线程就绪，等待cpu分配资源后执行run()函数
        thread1.start();
        thread2.start();

        try
        {
            //等待1s后结束进程
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread wrong");
        }
    }
}
class DelayThread extends Thread
{
    private  static int count=0;
    private int no;
    private int delay;
    public DelayThread()
    {
        count++;
        no=count;
    }
    public void run()
    {
        try
        {
            //总共最后会按照cpu资源分配使进程1和进程2交替进行（可能会连续两次进行统一进程），最终输出分别10个进程1和10个进程2进行的提示
            for(int i=0;i<10;i++)
            {
                //将延迟设为0-5s
                delay=(int)(Math.random()*5000);
                sleep(delay);
                System.out.println("Thread"+no+"with a delay"+delay);
            }
        }
        catch(InterruptedException e){}
    }
}