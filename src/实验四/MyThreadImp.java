package 实验四;

public class MyThreadImp implements Runnable
{
    private int delay;
    public void run()
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                delay=(int)(Math.random()*5000);
                Thread.sleep(delay);
                String str=String.format("Thread%d",Thread.currentThread().getId()-11);
                System.out.println(str+"with a delay"+delay);
            }
        }
        catch(InterruptedException e){}
    }
}
