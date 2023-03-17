package 实验五;

public class MainTest5_1_2
{
    public static void main(String[] args)
    {
        //捕捉NegativeArraySizeException和IndexOutOfBoundsException
        try
        {
            int[] a=new int[-1];
        }
        catch(NegativeArraySizeException ne)
        {
            System.out.println("捕捉到数组长度参数异常 "+ne.getMessage());
        }
        try
        {
            int[] b={0,1,2};
            for(int i=0;i<=3;i++)
            {
                b[i]++;
            }
        }
        catch(IndexOutOfBoundsException ie)
        {
            System.out.println("捕捉到数组索引越界异常 "+ie.getMessage());
        }

        //捕捉NullPointerException
        try
        {
            Test t=null;
            t.dispTest();
        }
        catch(NullPointerException e)
        {
            System.out.println("捕捉到对象空指针异常 "+e.getMessage());
        }
    }

}

class Test
{
    Test()
    {
        System.out.println("对象已创建");
    }

    public void dispTest()
    {
        System.out.println("对象已打印");
    }

}

